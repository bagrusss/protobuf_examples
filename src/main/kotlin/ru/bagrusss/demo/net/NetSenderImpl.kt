package ru.bagrusss.demo.net

import com.google.protobuf.Message
import com.google.protobuf.Parser
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import okhttp3.*
import java.lang.RuntimeException

class NetworkException(val errorCode: Int, val body: ByteArray?): RuntimeException()

class NetSenderImpl(private val baseUrl: String,
                    private val okHttpClient: OkHttpClient): NetSender {

    private companion object {
        const val X_PROTOBUF = "application/x-protobuf"
        @JvmField val PROTOBUF = MediaType.parse(X_PROTOBUF)
    }

    private val headers = mapOf(
            "Accept" to X_PROTOBUF,
            "Content-Type" to X_PROTOBUF)

    override fun <Request : Message, Response : Message> send(method: String,
                                                              path: String,
                                                              body: Request,
                                                              parser: Parser<Response>): Single<Response> {
        return Single.just(body)
                .map {
                    val requestBody = body.toByteArray()
                    val responseBody = send(path, method, requestBody)
                    parser.parseFrom(responseBody)
                }
                .subscribeOn(Schedulers.io())
    }

    private fun send(path: String, method: String, body: ByteArray): ByteArray {
        val url = baseUrl + path
        val request = Request.Builder()
                             .url(url)
                             .method(method.toUpperCase(), RequestBody.create(PROTOBUF, body))
                             .headers(Headers.of(headers))
                             .build()

        return okHttpClient.newCall(request).execute().run {
             if (!isSuccessful )
                body()?.bytes() ?: ByteArray(0)
            else throw NetworkException(code(), body()?.bytes())
        }
    }
}
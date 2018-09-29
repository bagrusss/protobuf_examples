package ru.bagrusss.demo.net

import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.protobuf.ProtoConverterFactory
import java.util.concurrent.TimeUnit

fun retrofitExample () {
    val okHttpClient = OkHttpClient.Builder()
                                   .connectTimeout(15L, TimeUnit.SECONDS)
                                   .writeTimeout(15L, TimeUnit.SECONDS)
                                   .readTimeout(15L, TimeUnit.SECONDS)
                                   .build()

    val retrofit = Retrofit.Builder()
                           .client(okHttpClient)
                           .baseUrl("http://example.com")
                           .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                           .addConverterFactory(ProtoConverterFactory.create())
                           .build()


}
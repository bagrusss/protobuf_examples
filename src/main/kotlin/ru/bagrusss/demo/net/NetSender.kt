package ru.bagrusss.demo.net

import com.google.protobuf.Message
import com.google.protobuf.Parser
import io.reactivex.Single

interface NetSender {

    fun <Request: Message, Response: Message> send(method: String,
                                                   path: String,
                                                   body: Request,
                                                   parser: Parser<Response>): Single<Response>
}
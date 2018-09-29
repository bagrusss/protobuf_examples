package ru.bagrusss.demo.net

import com.google.protobuf.Message
import com.google.protobuf.util.JsonFormat

object ProtoJsonUtils {

    private val jsonParser = JsonFormat.parser()
    private val jsonPrinter = JsonFormat.printer()

    fun <M : Message, B : Message.Builder> fromJson(json: String, protoBuilder: B): M {
        return protoBuilder.run {
            jsonParser.merge(json, this)
            build() as M
        }
    }

    fun <M : Message> toJson(proto: M): String {
        return jsonPrinter.print(proto)
    }

}


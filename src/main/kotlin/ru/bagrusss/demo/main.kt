package ru.bagrusss.demo

import ru.bagrusss.demo.net.ProtoJsonUtils


fun main(args: Array<String>) {

    val userJsonString = """
        {
            "id": 1234567890123456789,
            "name": "Vlad",
            "email": "example@email.com",
            "phones": [
                {
                    "number": "+7 (000) 000-00-00",
                    "type": "MOBILE"
                }
            ]
        }""".trimIndent()
    val userProto: User = ProtoJsonUtils.fromJson(userJsonString, User.newBuilder())

    val userJsonParsed = ProtoJsonUtils.toJson(userProto)

    println(userJsonParsed)
}
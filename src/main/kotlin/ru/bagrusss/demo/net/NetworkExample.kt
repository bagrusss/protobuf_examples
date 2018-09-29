package ru.bagrusss.demo.net

import ru.bagrusss.demo.Login
import ru.bagrusss.demo.Logout

class NetworkExample(private val netSender: NetSender) {

    fun sendLoginExample(pinCode: String) {
        val request = Login.Request.newBuilder().run {
            pin = pinCode
            build()
        }

        request.run {
            netSender.send(method, path, this, Login.Response.parser())
                    .subscribe { loginResponse ->
                        //doSomething(loginResponse)
                    }
        }
    }

    fun sendLogout() {
        val request = Logout.Request.getDefaultInstance()
        request.run {
            netSender.send(method, path, this, Logout.Response.parser())
                    .subscribe { logoutResponse ->

                    }
        }
    }
}
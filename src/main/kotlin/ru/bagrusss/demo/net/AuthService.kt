package ru.bagrusss.demo.net

import io.reactivex.Single
import retrofit2.http.DELETE
import retrofit2.http.POST
import ru.bagrusss.demo.proto.Login
import ru.bagrusss.demo.proto.Logout

interface AuthService {

    @POST("/login")
    fun login(body: Login.Request): Single<Login.Response>

    @DELETE("/delete")
    fun logout(body: Logout.Request): Single<Logout.Response>

}
package com.example.repolistgithub.data.services

import com.example.repolistgithub.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

//site usado para transformar o Json em objeto app.quicktype.io
interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String) : List<Repo>
}
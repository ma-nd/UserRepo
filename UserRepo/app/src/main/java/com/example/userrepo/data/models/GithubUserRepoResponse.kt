package com.example.userrepo.data.models


import com.google.gson.annotations.SerializedName

data class GithubUserRepoResponse(
    @SerializedName("fork")
    val fork: Boolean,
    @SerializedName("full_name")
    val fullName: String?,
    @SerializedName("git_url")
    val gitUrl: String?,
    @SerializedName("language")
    val language: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("stargazers_count")
    val stargazersCount: Int?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("html_url")
    val htmlUrl: String?,
) {
    fun toUserRepoModel() = UserRepoModel(
        name = name ?: "",
        description = description ?: "",
        languages = language.toString(),
        starsCount = stargazersCount ?: 0,
        url = htmlUrl ?: "",
    )
}
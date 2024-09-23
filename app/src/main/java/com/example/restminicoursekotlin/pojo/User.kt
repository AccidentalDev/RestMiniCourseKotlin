package com.example.restminicoursekotlin.pojo

import com.google.gson.annotations.SerializedName

class User(name: String, job: String){
    @SerializedName("name")
    var name: String = name

    @SerializedName("job")
    var job: String = job

    @SerializedName("id")
    var id: String? = null

    @SerializedName("createdAt")
    var createdAt: String? = null
}
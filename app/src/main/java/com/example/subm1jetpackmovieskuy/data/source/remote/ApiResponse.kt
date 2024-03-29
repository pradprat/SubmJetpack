package com.example.subm1jetpackmovieskuy.data.source.remote

import androidx.annotation.Nullable


class ApiResponse<T>(val status: StatusResponse, @param:Nullable @field:Nullable
var body: T, @param:Nullable @field:Nullable val message: String?) {
    companion object {

        fun <T> success(@Nullable body: T): ApiResponse<T> {
            return ApiResponse(StatusResponse.SUCCESS, body, null)
        }

        fun <T> empty(msg: String, @Nullable body: T): ApiResponse<T> {
            return ApiResponse(StatusResponse.EMPTY, body, msg)
        }

        fun <T> error(msg: String, @Nullable body: T): ApiResponse<T> {
            return ApiResponse(StatusResponse.ERROR, body, msg)
        }
    }

}
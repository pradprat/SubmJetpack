package com.example.subm1jetpackmovieskuy.movie.data

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
class Movie(
        @ColumnInfo(name = "popularity")
        @SerializedName("popularity")
        val popularity: Double,
        @ColumnInfo(name = "vote_count")
        @SerializedName("vote_count")
        val vote_count: Int,
        @ColumnInfo(name = "video")
        @SerializedName("video")
        val video: Boolean,
        @ColumnInfo(name = "poster_path")
        @SerializedName("poster_path")
        val poster_path: String?,
        @PrimaryKey
        @NonNull
        @ColumnInfo(name = "id")
        @SerializedName("id")
        val id: Int,
        @ColumnInfo(name = "adult")
        @SerializedName("adult")
        val adult: Boolean,
        @ColumnInfo(name = "backdrop_path")
        @SerializedName("backdrop_path")
        val backdrop_path: String?,
        @ColumnInfo(name = "original_language")
        @SerializedName("original_language")
        val original_language: String?,
        @ColumnInfo(name = "original_title")
        @SerializedName("original_title")
        val original_title: String?,
        @ColumnInfo(name = "title")
        @SerializedName("title")
        val title: String?,
        @ColumnInfo(name = "vote_average")
        @SerializedName("vote_average")
        val vote_average: Double,
        @ColumnInfo(name = "overview")
        @SerializedName("overview")
        val overview: String?,
        @ColumnInfo(name = "release_date")
        @SerializedName("release_date")
        val release_date: String?,
        @ColumnInfo(name = "is_favorite")
        var is_favorite: Int = 0
) : Parcelable
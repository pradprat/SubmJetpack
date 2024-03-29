package com.example.subm1jetpackmovieskuy.data.source.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.subm1jetpackmovieskuy.movie.data.Movie
import com.example.subm1jetpackmovieskuy.tvShow.data.TvShow


@Database(entities = [Movie::class, TvShow::class], version = 3, exportSchema = false)
abstract class RoomDb : RoomDatabase() {

    abstract fun roomDao(): RoomDao

    companion object {

        private var INSTANCE: RoomDb? = null

        private val sLock = Any()

        fun getInstance(context: Context): RoomDb {
            synchronized(sLock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                            RoomDb::class.java, "movieDB")
                            .fallbackToDestructiveMigration()
                            .build()
                }
                return INSTANCE as RoomDb
            }
        }
    }

}
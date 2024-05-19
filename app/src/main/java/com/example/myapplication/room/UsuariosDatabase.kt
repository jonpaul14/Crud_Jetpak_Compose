package com.example.myapplication.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.models.Usuarios

@Database(
    entities = [Usuarios::class],
    version = 1,
    exportSchema = false

)
abstract class UsuariosDatabase: RoomDatabase() {
    abstract fun usariosDao(): UsuariosDatabaseDao
}
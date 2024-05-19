package com.example.myapplication.models

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarios")
data class Usuarios(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    @ColumnInfo("usuario")
    val usuario: String,
    @ColumnInfo("email")
    val email: String
)

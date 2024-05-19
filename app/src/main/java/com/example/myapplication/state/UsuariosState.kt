package com.example.myapplication.state

import com.example.myapplication.models.Usuarios

data class UsuariosState(
    val listaUsuarios: List<Usuarios> = emptyList()
)

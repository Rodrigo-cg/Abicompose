package com.example.abicompose.util

fun String.containsNumber():Boolean{
    val regex = Regex(".*\\d+.*")
    return regex.matches(this)
}

fun String.containsUpperCase():Boolean{
    val regex = Regex(".*[A-Z]+.*")
    return regex.matches(this)
}

fun String.containsSpecialChar():Boolean{
    val regex = Regex(".*[^A-Za-z\\d]+.*")
    return regex.matches(this)
}
fun String.validarFormatoCorreo():Boolean{
    val regex = Regex("^[\\w\\.-]+@[\\w\\.-]+\\.\\w+$")
    return regex.matches(this)
}
package com.onimaskesi.unittestdemo

object RegistrationUnit {

    var userList = listOf("Erdem", "Onat")

    fun validateUserRegistration(
        userName : String,
        password : String,
        confirmPassword : String

    ) : Boolean {

        return !(
            userName.isEmpty() ||
            password.isEmpty() ||
            confirmPassword.isEmpty() ||
            userName in userList ||
            password.count{ it.isDigit() } < 2 ||
            password != confirmPassword
        )

    }

}
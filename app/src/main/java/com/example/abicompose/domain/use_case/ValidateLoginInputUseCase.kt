package com.example.abicompose.domain.use_case

import com.example.abicompose.domain.model.LoginInputValidationType

class ValidateLoginInputUseCase {
    operator fun invoke(email: String, password:String): LoginInputValidationType {
        if(email.isEmpty() || password.isEmpty()){
            return LoginInputValidationType.EmptyField
        }
        if("@" !in email){
            return LoginInputValidationType.NoEmail
        }
        return LoginInputValidationType.Valid
    }
}
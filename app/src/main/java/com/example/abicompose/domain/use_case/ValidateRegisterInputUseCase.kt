package com.example.abicompose.domain.use_case

import com.example.abicompose.domain.model.RegisterInputValidationType
import com.example.abicompose.util.containsNumber
import com.example.abicompose.util.containsSpecialChar
import com.example.abicompose.util.containsUpperCase
import com.example.abicompose.util.validarFormatoCorreo

class ValidateRegisterInputUseCase {
    operator fun invoke(
        email: String,
        password: String,
        passwordRepeated: String
    ): RegisterInputValidationType {
        if(email.isEmpty() || password.isEmpty() || passwordRepeated.isEmpty()){
            return RegisterInputValidationType.EmptyField
        }
        if(!email.validarFormatoCorreo()){
            return RegisterInputValidationType.NoEmail
        }
        if(password!= passwordRepeated){
            return RegisterInputValidationType.PasswordsDoNotMatch
        }
        if(password.count() < 8){
            return RegisterInputValidationType.PasswordTooShort
        }
        if(!password.containsNumber()){
            return RegisterInputValidationType.PasswordNumberMissing
        }
        if(!password.containsUpperCase()){
            return RegisterInputValidationType.PasswordUpperCaseMissing
        }
        if(!password.containsSpecialChar()){
            return RegisterInputValidationType.PasswordSpecialCharMissing
        }
        return RegisterInputValidationType.Valid
    }
}
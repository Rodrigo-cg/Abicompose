package com.example.abicompose.domain.use_case

import com.example.abicompose.domain.model.LoginInputValidationType
import junit.framework.TestCase.assertEquals
import org.junit.Test

class ValidateLoginInputUseCaseTest {
    private val validateLoginInputUseCase= ValidateLoginInputUseCase()

    @Test
    fun testemptyfieldreturnsValidationTypeemptfield(){
        val result=validateLoginInputUseCase(email="",password="password")
        assertEquals(result,LoginInputValidationType.EmptyField)
    }

}
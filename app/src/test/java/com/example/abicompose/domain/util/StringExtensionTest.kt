package com.example.abicompose.domain.util

import com.example.abicompose.domain.model.LoginInputValidationType
import com.example.abicompose.util.containsNumber
import com.example.abicompose.util.validarFormatoCorreo
import com.google.common.truth.Truth.assertThat


import org.hamcrest.MatcherAssert
import junit.framework.TestCase
import org.junit.Assert.assertThat
import org.junit.Test

class StringExtensionTest {
    @Test
    fun `test string contains no number returns false when check for it`() {
        // Tu código aquí
        val result="sddsf@dfdf.csd".validarFormatoCorreo()
        assertThat(result).isTrue()
    }
}
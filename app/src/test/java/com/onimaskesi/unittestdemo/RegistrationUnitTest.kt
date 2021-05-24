package com.onimaskesi.unittestdemo

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUnitTest{

    @Test
    fun `empty user name returns false`(){
        val result = RegistrationUnit.validateUserRegistration(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `the user is exists than return false`(){
        val result = RegistrationUnit.validateUserRegistration(
            "Erdem",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `the passwords are not same than return false`(){
        val result = RegistrationUnit.validateUserRegistration(
            "KIRAL",
            "124",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `the password is less two digits than return false`(){
        val result = RegistrationUnit.validateUserRegistration(
            "KIRAL",
            "1",
            "1"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid user name and repeated passwords return true`(){
        val result = RegistrationUnit.validateUserRegistration(
            "KIRAL",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUnit.validateUserRegistration(
            "KIRAL",
            "",
            ""
        )
        assertThat(result).isFalse()
    }


}
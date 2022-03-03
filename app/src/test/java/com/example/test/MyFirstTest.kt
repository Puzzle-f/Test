package com.example.test

import org.junit.Assert.*
import org.junit.Test

class MyFirstTest {

    @Test
    fun emailValidator_Correct1(){
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("nameemail.co.uk"))
    }

    @Test
    fun emailValidator_CorrectEmail_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun myEqualsExperimentFalse(){
        assertFalse(del1.equals(del2))
    }

    @Test
    fun myEqualsExperimentTrue(){
        assertTrue(del2.equals(del3))
    }

    @Test
    fun myEqualsExperimentEquasle(){
        assertEquals(del2, del3)
    }

    @Test
    fun myNotEqualseExperimental(){
        assertNotEquals(del1, del2)
    }

    @Test
    fun myCheckIsNull(){
        assertNull(del4)
    }

    @Test
    fun myTestNotNull(){
        assertNotNull(del1)
    }

    @Test
    fun myTestAssertSame(){
        assertSame(del1, del5)
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.formativeassesmentpart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class FormativeAssesmentPart1Test {
    
    public class LoginTest {

        public LoginTest() {
    }
 

    /**
     * Test of main method, of class FormativeAssesmentPart1.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
      
        
    }
            

    Login login1 = new Login(
            "Camran",
            "Davids",
            "CD1_1",
            "Ch&sec@ke99!",
            "+27838968976"
    );

    Login login2 = new Login(
            "Camran",
            "Davids",
            "Camran!!!!",
            "password",
            "08966553"
    );

    // ASSERT EQUALS

    @Test
    public void testUsernameCorrectlyFormatted() {

        String expected =
                "Welcome Camran, Davids it is great to see you again.";

        boolean result =
                login1.loginUser("CDl_1",
                        "Ch&sec@ke99!");

        assertEquals(expected,
                login1.returnLoginStatus(result));
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {

        String expected =
                "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";

        assertEquals(expected,
                login2.registerUser());
    }

    @Test
    public void testPasswordMeetsComplexityRequirements() {

        String expected =
                "Password successfully captured.";

        String actual =
                login1.checkPasswordComplexity()
                        ? "Password successfully captured."
                        : "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";

        assertEquals(expected, actual);
    }

    @Test
    public void testPasswordDoesNotMeetComplexityRequirements() {

        String expected =
                "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";

        String actual =
                login2.checkPasswordComplexity()
                        ? "Password successfully captured."
                        : "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";

        assertEquals(expected, actual);
    }

    @Test
    public void testCellPhoneCorrectlyFormatted() {

        String expected =
                "Cell number successfully captured.";

        String actual =
                login1.checkCellPhoneNumber()
                        ? "Cell number successfully captured."
                        : "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";

        assertEquals(expected, actual);
    }

    @Test
    public void testCellPhoneIncorrectlyFormatted() {

        String expected =
                "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";

        String actual =
                login2.checkCellPhoneNumber()
                        ? "Cell number successfully captured."
                        : "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";

        assertEquals(expected, actual);
    }

    // ASSERT TRUE/FALSE

    @Test
    public void testLoginSuccessful() {
        assertTrue(
                login1.loginUser(
                        "kyl_1",
                        "Ch&sec@ke99!"
                )
        );
    }

    @Test
    public void testLoginFailed() {
        assertFalse(
                login1.loginUser(
                        "wrong",
                        "wrong"
                )
        );
    }

    @Test
    public void testUsernameCorrect() {
        assertTrue(
                login1.checkUserName()
        );
    }

    @Test
    public void testUsernameIncorrect() {
        assertFalse(
                login2.checkUserName()
        );
    }

    @Test
    public void testPasswordCorrect() {
        assertTrue(
                login1.checkPasswordComplexity()
        );
    }

    @Test
    public void testPasswordIncorrect() {
        assertFalse(
                login2.checkPasswordComplexity()
        );
    }

    @Test
    public void testCellPhoneCorrect() {
        assertTrue(
                login1.checkCellPhoneNumber()
        );
    }

    @Test
    public void testCellPhoneIncorrect() {
        assertFalse(
                login2.checkCellPhoneNumber()
        );
    }
}
}
}

package com.example.Average;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App app=new App();
    void twonumbers() {
    	assertEquals(1,app.twonumbers(1,2));
    }
    void threenumbers() {
        assertEquals(2,app.threenumbers(1, 2, 3));
    }
}

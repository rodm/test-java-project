package com.example.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void helloMessage() {
        Hello hello = new Hello();

        assertEquals("Hello user", hello.message("user"));
    }

    @Test
    public void helloMain() {
        Hello.main(new String[]{});
    }
}

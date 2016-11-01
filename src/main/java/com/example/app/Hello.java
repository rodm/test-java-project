package com.example.app;

public class Hello {

    public static void main(String[] args) {
        new Hello().message(System.getenv("USER"));
    }

    public String message(String user) {
        return "Hello " + user;
    }
}

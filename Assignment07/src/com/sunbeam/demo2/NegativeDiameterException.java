package com.sunbeam.demo2;

public class NegativeDiameterException extends Exception {
    NegativeDiameterException() {
        super("Diameter cannot be negative.");
    }
}


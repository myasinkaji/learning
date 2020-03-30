package com.beroozresaan.security.ident.model.dto.BRIDGE.logger;

// Logger has two implementations: info and warning
@FunctionalInterface
public interface Logger {
//    static Logger info() {
//        return message -> System.out.println("info : " + message);
//    }
//
//    static Logger warning() {
//        return message -> System.out.println("warning: " + message);
//    }

    void log(String message);
}
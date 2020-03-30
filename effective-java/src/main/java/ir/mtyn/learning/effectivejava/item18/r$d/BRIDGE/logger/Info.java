package com.beroozresaan.security.ident.model.dto.BRIDGE.logger;

/**
 * @author Mohammad Yasin Sadeghi
 */
public class Info implements Logger {
    @Override
    public void log(String message) {
        System.out.println("info: " + message);
    }
}

package com.beroozresaan.security.ident.model.dto.BRIDGE;

import com.beroozresaan.security.ident.model.dto.BRIDGE.logger.Info;
import com.beroozresaan.security.ident.model.dto.BRIDGE.logger.Logger;

abstract class AbstractAccount {
    //    private Logger logger = Logger.info();
    private Logger logger = new Info();

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    // the logging part is delegated to the Logger implementation
    protected void operate(String message, boolean result) {
        logger.log(message + " result " + result);
    }

}
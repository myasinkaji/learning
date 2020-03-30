package com.beroozresaan.security.ident.model.dto.BRIDGE;

import com.beroozresaan.security.ident.model.dto.BRIDGE.logger.Logger;
import com.beroozresaan.security.ident.model.dto.BRIDGE.logger.Warning;

public class BridgeDemo {
    public static void main(String[] args) {
        SimpleAccount account = new SimpleAccount(100);
        account.withdraw(75);

        if (account.isBalanceLow()) {
            // you can also change the Logger implementation at runtime
//            account.setLogger(Logger.warning());
            account.setLogger(new Warning());
        }

        account.withdraw(10);
        account.withdraw(100);
    }
}

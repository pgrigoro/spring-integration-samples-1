package org.springframework.integration.samples.amqp;

import org.springframework.util.ErrorHandler;


public class MyErrorHandler implements ErrorHandler {

    @Override
    public void handleError(Throwable throwable) {
        String ok = "haha";
    }

}
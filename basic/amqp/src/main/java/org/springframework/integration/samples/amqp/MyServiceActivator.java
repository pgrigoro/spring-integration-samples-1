package org.springframework.integration.samples.amqp;

import org.springframework.amqp.core.Message;

public class MyServiceActivator {
    public void handleMessage1(Exception message) {
        System.out.println("handleMessage1");
        //return null;
    }

    public void handleMessage2(Exception message) {
        System.out.println("handleMessage2");
        //return null;
    }

    public void handleMessage3(Exception message) {
        System.out.println("handleMessage3: " + message.getMessage());
        //return message.getMessage();
    }


    public void causeError(Exception message) {
        throw new RuntimeException("No!!!");
    }

    public void handelQueueError(Exception message) {
        String ok = "hello";
    }
}

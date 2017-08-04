package org.springframework.integration.samples.ws;

public class ErrorHandler {

    public String handleError(Exception ex) throws InterruptedException {
        System.out.println(Thread.currentThread().getId() + " - Started Handling Error");
        Thread.sleep(5000); // Start breaking down when it reaches 997
//        System.out.println(Thread.currentThread().getId() + " - Woke up from a 5 second sleep in the Error Handler");
        return "<echoResponse xmlns=\"http://www.springframework.org/spring-ws/samples/echo\">I am alive</echoResponse>";
    }
}

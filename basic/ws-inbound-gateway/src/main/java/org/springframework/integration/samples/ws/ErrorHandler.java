package org.springframework.integration.samples.ws;

public class ErrorHandler {

    public String handleError(Exception ex) throws InterruptedException {
        System.out.println("Started Handling Error");
        Thread.sleep(3000); // Start breaking down when it reaches 997
        System.out.println("Woke up from a long sleep in the Error Handler");
        return "<echoResponse xmlns=\"http://www.springframework.org/spring-ws/samples/echo\">I am alive</echoResponse>";
    }
}

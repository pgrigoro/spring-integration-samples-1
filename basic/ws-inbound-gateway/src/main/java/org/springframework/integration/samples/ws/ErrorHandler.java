package org.springframework.integration.samples.ws;

public class ErrorHandler {

    public String handleError(Exception ex) {
        return "<echoResponse xmlns=\"http://www.springframework.org/spring-ws/samples/echo\">I am alive</echoResponse>";
    }
}

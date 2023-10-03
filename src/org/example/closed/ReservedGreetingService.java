package org.example.closed;

public class ReservedGreetingService implements ClosedService{
    public static final String PREFIX = "ReservedGreetingService";
    @Override
    public void greet(String greetings) {
        System.out.println(PREFIX + " - "  + greetings);
    }
}

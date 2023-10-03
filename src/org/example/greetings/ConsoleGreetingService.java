package org.example.greetings;

public class ConsoleGreetingService implements GreetingService {
    @Override
    public void greet(String greetings) {
        System.out.println(greetings);
    }
}

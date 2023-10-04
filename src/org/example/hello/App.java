package org.example.hello;
import org.example.greetings.ConsoleGreetingService;

public class App {
    public static void main(String[] args) throws Exception {
        ConsoleGreetingService greetingService = new ConsoleGreetingService();
        greetingService.greet("Hello, World!");
    }
}

package org.example.hello;
import org.example.greetings.*;

public class App {
    public static void main(String[] args) throws Exception {
        GreetingService greetingService = new ConsoleGreetingService();
        greetingService.greet("Hello, World!");
    }
}

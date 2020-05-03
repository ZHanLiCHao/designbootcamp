package com.dddexplained.designbootcamp.decorator;

import org.junit.Test;

public class UserTest {
    @Test
    public void should_test() {
        User user = new User();
        user.login();

        System.out.println("--------");

        User logging = new LoggingDecorator(new User());
        logging.login();

        System.out.println("--------");

        LoggingDecorator logging1 = new LoggingDecorator(new Employee());
        SecurityDecorator security = new SecurityDecorator(logging1);
        security.login();
    }
}
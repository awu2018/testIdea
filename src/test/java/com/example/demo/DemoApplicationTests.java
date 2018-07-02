package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    public static final Integer INTEGER = 44;
    private String name;

    @Test
    public void contextLoads() {
        String as = "as";
        String username;
        String s = as;
        String x = String.format("a: %s ;b:%d", s, INTEGER);
        name = x;
        System.out.println(name);
        first();
        first();
        first();

    }

    private void first() {
        f(name, INTEGER);
        f(name, INTEGER);
    }

    private void f(String x, Integer y) {
    }

}

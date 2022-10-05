package jaf.components;

import org.springframework.stereotype.Component;

@Component
public class Implementation2 implements Functionality {

    @Override
    public String doStuff() {
        return "HELLO WORLD";
    }

    public static void main(String[] args) {

    }
}
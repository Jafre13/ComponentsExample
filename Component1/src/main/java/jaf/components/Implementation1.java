package jaf.components;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Implementation1 implements Functionality {

    @Override
    public String doStuff() {
        return "HELLO OTHER WORLD";
    }

    public static void main(String[] args) {

    }
}
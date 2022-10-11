package jaf.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class RestServiceImpl {

    @Autowired
    private Functionality functionality;

    @GetMapping("api")
    public String doStuff() {
        return functionality.doStuff();
    }

    public static void main(String[] args) {

    }
}
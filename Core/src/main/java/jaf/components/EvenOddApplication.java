package jaf.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "jaf.components")
@RestController
public class EvenOddApplication {

    private EvenOddService evenOddService;

   @Autowired
   private Functionality functionality;

    @Autowired
    private ApplicationContext applicationContext;

    // constructor

    @GetMapping("/validate/")
    public String isEvenOrOdd(
            @RequestParam("number") Integer number) {
        System.out.println(functionality.doStuff());
        return evenOddService.isEvenOrOdd(number);
    }

    public static void main(String[] args) {
        SpringApplication.run(EvenOddApplication.class, args);
    }

    @Bean
    public void run(){
        System.out.println("Running stuff next will call functionality");
        System.out.println(functionality.doStuff());

        System.out.println("available beans");
        for (String s : applicationContext.getBeanNamesForType(Functionality.class)) {
            System.out.println(s);
        }

    }
}
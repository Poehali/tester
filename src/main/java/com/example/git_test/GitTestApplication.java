package com.example.git_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);

        //---------------------------------------------------------

        System.out.println("Hello 1 !");
        System.out.println("Hello 77777 DEV !");
        System.out.println("Hello 555555 DEV !");
        System.out.println("Hello 3 DEV !");
        System.out.println("Hello 777 DEV !");
        System.out.println("Hello 5555 DEV !");
        System.out.println("Hello 333 DEV !");


        Example ext=new  Example();
        ext.setName("exTest");
        System.out.println("Hello 1 !"+ "ext.name="+ext.getName());



















        //---------------------------------------------------------
    }

}

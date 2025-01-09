package io.github.patrikalm;

import io.github.patrikalm.data_access.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello, World!");


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (ComponentScanConfig.class);

        StudentDao studentDao = context.getBean(StudentDaoListImpl.class);

        UserInputService userInputService = context.getBean(UserInputService.class);



    }
}
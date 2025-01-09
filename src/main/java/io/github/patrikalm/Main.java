package io.github.patrikalm;

import io.github.patrikalm.data_access.ComponentScanConfig;
import io.github.patrikalm.data_access.StudentDao;
import io.github.patrikalm.data_access.StudentDaoListImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello, World!");


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (ComponentScanConfig.class);

        StudentDao studentDao = context.getBean(StudentDaoListImpl.class);



    }
}
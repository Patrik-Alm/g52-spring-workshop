package io.github.patrikalm.data_access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService{


    @Autowired
    @Override
    public String getString(Scanner scanner) {
        System.out.println("Insert a string: ");
        return scanner.next();
    }

    @Override
    public int getInt() {
        return 0;
    }


}

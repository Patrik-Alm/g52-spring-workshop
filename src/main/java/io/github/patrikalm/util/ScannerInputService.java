package io.github.patrikalm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService {

    private final Scanner scanner;

    @Autowired
    public ScannerInputService( Scanner scanner ) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        System.out.print("Insert a string: ");
        return scanner.nextLine();
    }

    @Override
    public int getInt() {
        return 0;
    }


}

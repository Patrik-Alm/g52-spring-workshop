package io.github.patrikalm.data_access;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService{

    @Override
    public String getString() {
        return "";
    }

    @Override
    public int getInt() {
        return 0;
    }



    Scanner scanner = new Scanner(System.in);
}

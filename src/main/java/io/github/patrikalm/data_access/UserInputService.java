package io.github.patrikalm.data_access;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public interface UserInputService {

    @Autowired
    String getString(Scanner scanner);

    int getInt();
}

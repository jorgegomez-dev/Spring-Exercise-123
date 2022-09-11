package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    // 1. Atributo de clase
    NotificationService not;

    // 2. Constructor
    public UserService(NotificationService not){
        System.out.println("Ejecutando constructor UserService");
        this.not = not;
    }
}

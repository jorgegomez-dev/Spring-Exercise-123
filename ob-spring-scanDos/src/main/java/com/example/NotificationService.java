package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public static String imprimirSaludo(){
        String holaMundo = "Hola Mundo!";
        return holaMundo;
    }
}

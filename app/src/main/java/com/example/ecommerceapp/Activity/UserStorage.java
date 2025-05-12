package com.example.ecommerceapp;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    private static Map<String, String> users = new HashMap<>();

    // Método para verificar se o usuário existe
    public static boolean userExists(String username) {
        return users.containsKey(username);
    }

    // Método para validar o usuário e senha
    public static boolean validateUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    // Método para adicionar um usuário
    public static void addUser(String username, String password) {
        users.put(username, password);
    }
}

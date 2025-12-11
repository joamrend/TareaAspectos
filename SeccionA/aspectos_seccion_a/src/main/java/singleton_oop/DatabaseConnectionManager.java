/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton_oop;

import java.io.*;

/**
 *
 * @author joanm
 */
public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;

    private DatabaseConnectionManager() {
        // Private constructor to prevent external instantiation
    }

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    // Additional methods for managing database connections...
}
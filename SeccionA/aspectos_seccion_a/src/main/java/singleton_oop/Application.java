/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton_oop;

/**
 *
 * @author joanm
 */
public class Application {
    public static void main(String[] args) {
        // Accessing the single instance of DatabaseConnectionManager
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();
        // Using the connection manager to handle database connections...
    }
}

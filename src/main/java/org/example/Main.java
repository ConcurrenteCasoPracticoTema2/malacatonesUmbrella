package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3308/my-app?serverTimezone=UTC";
        String username = "root";
        String password = "P4ssword!";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            System.out.println("Connected to the database!");

            String query = "SELECT 1";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()) {
                    int result = resultSet.getInt(1);
                    System.out.println("Query result: " + result);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
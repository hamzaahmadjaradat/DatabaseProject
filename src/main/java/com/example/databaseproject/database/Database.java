package com.example.databaseproject.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Database database;
    private static Connection connection;
    private static String port = "3306";
    private static String dbName = "parkingSystem";
    private static String userName = "root";
    private static String dbPassword = "root1234";

    private Database() {
        connectDB();
    }

    public static void connectDB() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:" + port + "/" + dbName + "?useLegacyDatetimeCode=true&serverTimezone=UTC&useSSL=false", userName, dbPassword);
        } catch (SQLException e) {
        }
    }

    static Database getInstance() {
        if (database == null) {
            database = new Database();
        }

        return database;
    }

   /*
    Do an execute method for executing a String Query
     */


}

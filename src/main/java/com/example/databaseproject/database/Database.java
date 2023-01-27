package com.example.databaseproject.database;

public class Database {
    private static Database database;
    private Database(){
        /*
        DO connection for the database
         */

    }
    static Database getInstance(){
        if(database == null){
            database = new Database();
        }
        return database;
    }
    /*
    Do an execute method for executing a String Query
     */
}

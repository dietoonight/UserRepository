package org.example;

public class DBUtils {
    /*private String dbUrl = "jdbc:h2:mem:test; INIT =RUNSCRIPT FROM 'classpath:init.sql'";
    public static Connection getConnection(){
        Connection connection = null;

        connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);*/
    private String url = "jdbc:postgresql://localhost:5432/UserRepository";
    private String user = "postgres";
    private String password = "Shapovalenko0909!";

}

package com._20_Database_Connectivity;

import java.sql.*;

public class OracleConnect {
    // Your information may be different than my database information given here below
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    static final String USER = "hr";
    static final String PASS = "hr";
    static final String QUERY = "SELECT employee_id, first_name, last_name, salary FROM Employees";

    public static void main(String[] args) {
        // Open a connection
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loaded");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Established");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            {
                // Extract data from result set
                while (rs.next()) {
                    // Retrieve by column name
                    System.out.print("ID: " + rs.getInt("employee_id"));
                    System.out.print(", First_Name: " + rs.getString("first_name"));
                    System.out.print(", Last_Name: " + rs.getString("last_name"));
                    System.out.println(", Salary: " + rs.getInt("salary"));
                }
                conn.close();
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

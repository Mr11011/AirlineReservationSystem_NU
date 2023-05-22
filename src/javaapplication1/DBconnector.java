/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class DBconnector {

     public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AirlineReservationSystemProject", "root", "3122002@Ma");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Flight");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("destination"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}

package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {

    public void readUsers() {

        try {

            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while(rs.next()) {

                System.out.println(
                    rs.getInt("id") + " "
                    + rs.getString("name") + " "
                    + rs.getString("email")
                );

            }

        } catch(Exception e){
            e.printStackTrace();
        }

    }
}

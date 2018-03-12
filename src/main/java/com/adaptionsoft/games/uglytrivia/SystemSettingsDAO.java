package com.adaptionsoft.games.uglytrivia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Created by itzik on 1/7/2016.
 */
public class SystemSettingsDAO {
    private int numberOfQuestions;

    public SystemSettingsDAO() {
        try {
            Connection conn = null;
            Properties connectionProps = new Properties();
            connectionProps.put("user", "myuser");
            connectionProps.put("password", "mypassword");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/",
                    connectionProps);
        } catch (Throwable ex) {
        	numberOfQuestions = 20;
            //throw new RuntimeException(ex);
        }

    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.nbds.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lakshithad
 */
public class DBConnection {

    private static Connection con;

    private static final String dbHost = "localhost";
    private static final String dbPort = "3306";
    private static final String dbSceme = "nbds";
    private static final String dbCon = "mysql";
    private static final String dbUrl = "jdbc:" + dbCon + "://" + dbHost + ":" + dbPort + "/" + dbSceme;
    private static final String dbUsername = "root";
    private static final String dbPassword = "1234";

    public static void createConnection() throws Exception {
        if (con == null) {
            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        }
    }

    public static Connection getConnection() throws Exception {
        createConnection();
        return con;
    }
}

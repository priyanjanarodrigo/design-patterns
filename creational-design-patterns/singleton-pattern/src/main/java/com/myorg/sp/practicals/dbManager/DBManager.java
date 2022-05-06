package com.myorg.sp.practicals.dbManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    private static volatile DBManager dbManager;
    private static volatile Connection connection;

    private DBManager() {
        if (dbManager != null) {
            throw new RuntimeException("dbManager instance must be obtained by calling getInstance() method");
        }
    }

    public static DBManager getInstance() {
        if (dbManager == null) {
            synchronized (DBManager.class) {
                if (dbManager == null) {
                    dbManager = new DBManager();
                }
            }
        }
        return dbManager;
    }

    /**
     * This method is purposely not declared as a static because we expect the developer to get the dbManager instance
     * and from that get a connection
     */
    public Connection getConnection() {
        if (connection == null) {
            synchronized (DBManager.class) {
                if (connection == null) {
                    String url = "jdbc:derby:memory:sample;create=true";
                    try {
                        connection = DriverManager.getConnection(url);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }
}

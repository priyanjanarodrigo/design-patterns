package com.myorg.sp.practicals.dbManager;

import java.sql.Connection;

public class DBManagerDemo {
    public static void main(String[] args) {

        long start;
        long end;

        DBManager dbManager1 = DBManager.getInstance();

        start = System.currentTimeMillis();
        Connection connection1 = dbManager1.getConnection();
        end = System.currentTimeMillis();

        System.out.println("first getConnection call duration = "+(end - start));

        DBManager dbManager2 = DBManager.getInstance();

        start = System.currentTimeMillis();
        Connection connection2 = dbManager2.getConnection();
        end = System.currentTimeMillis();

        System.out.println("second getConnection call duration = "+(end - start));
    }
}

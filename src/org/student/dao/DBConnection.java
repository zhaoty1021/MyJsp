package org.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url= "jdbc:mysql://localhost:3306/userlist?serverTimezone=GMT%2B8&useSSL=false&autoReconnect=true";
	private static final String user = "root";
	private static final String password = "1025338403";
    
    public Connection conn;
    public Connection getconn() {
    	conn=null;
        try {
            Class.forName(driver);// ������������
            conn =DriverManager.getConnection(url, user, password);// �������ݿ�
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public void close() {
        try {
            this.conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
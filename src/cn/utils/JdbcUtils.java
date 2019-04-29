package cn.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
    public static void main(String args[]) {
        Connection con = JdbcUtils.getConnection();

        System.out.println(con);

    }
    static
    {
        System.out.println("静态块");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() {
        try {

            return DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}

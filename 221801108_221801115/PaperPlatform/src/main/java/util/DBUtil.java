package util;

import java.sql.*;

public class DBUtil {
    static String ip = "127.0.0.1";
    static int port = 3306;
    static String database = "paperdata";
    static String encoding = "UTF-8";
    static String loginName = "root";
    static String password = "123456";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s&serverTimezone=GMT&useSSL=false", ip, port, database, encoding);
        return DriverManager.getConnection(url, loginName, password);
    }

    /* 关闭连接 */
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        try {
            if (rs != null)
                rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (stmt != null)
                stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            if (conn != null)
                conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

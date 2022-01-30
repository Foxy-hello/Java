package Unitls;

import com.mysql.cj.jdbc.Driver;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类
 */
public class JDBCUtils {
    /**
     * 获取连接方法
     * @return
     */
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    static {
        //读取资源文件，获取值 properties集合类
        //获取src路径下文件的方式 Class.Loader,类加载器
        ClassLoader classLoader = JDBCUtils.class.getClassLoader();
        URL res = classLoader.getResource("Jdbc.properties");
        String path = res.getPath();//获取他的字符串路径
        try {
        Properties pro = new Properties();
        pro.load(new FileReader(path));
        //获取数据并赋值
        url =  pro.getProperty("url");
        user = pro.getProperty("user");
        password = pro.getProperty("password");
        driver = pro.getProperty("driver");
        //注册驱动
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    /**
     * 释放资源方法
     * @param stmt
     * @param conn
     */
    public static void close(Statement stmt , Connection conn){
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 重载
     */
    public static void close(ResultSet rs, Statement stmt , Connection conn){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}

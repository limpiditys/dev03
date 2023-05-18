package com.jfl.util;

import java.sql.*;

public class BaseDao {
    public static Connection getCon() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql:///my_week3","root","root");

        return connection;
    }

    public static void close(Connection con, PreparedStatement pre, ResultSet res) throws Exception {
        if (con != null) {
            con.close();
        }
        if (pre != null) {
            pre.close();
        }
        if (res != null) {
            res.close();
        }

    }
}
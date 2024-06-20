package C09Networking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.net.Socket;
import java.sql.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class C0904Webserver3 {
    public static void main(String[] args) throws SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String userName = "root";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println("DB 연결 성공");


        Statement st = con.createStatement();
        ServerSocket serverSocket = new ServerSocket(8081);
        String myQuery = "SELECT * FROM post";
        ResultSet rs = st.executeQuery(myQuery);
        int id =0;
        String title = "";
        while (rs.next()){
            id = rs.getInt("id");
            title = rs.getString("title");
            System.out.println("id는 " + id + "  title은 "+title);
        }
    }
}

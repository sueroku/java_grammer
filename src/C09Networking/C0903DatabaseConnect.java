package C09Networking;

import java.io.BufferedReader;
import java.net.Socket;
import java.sql.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class C0903DatabaseConnect {
    public static void main(String[] args) throws SQLException, IOException {
//        mssql 드라이버가 필요
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String userName = "root";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println("DB 연결 성공");

////        statement : 쿼리를 담아 db로 쿼리 전달하는 객체
//        Statement st = con.createStatement();
//        String myQuery = "SELECT * FROM post";
////        st.executeQuery(myQuery);
//        ResultSet rs = st.executeQuery(myQuery);
//        int id =0;
//        String title = "";
//        while (rs.next()){
//            id = rs.getInt("id");
//            title = rs.getString("title");
//            System.out.println("id는 " + id + "  title은 "+title);
//        }

//        int author_id =1;
//        String author_name ="";
//        String author_email="";
//        String author_password="";
//        Statement st = con.createStatement();
//        String myQuery = "SELECT * FROM author where id=" + author_id;
//        ResultSet rs = st.executeQuery(myQuery);
//        while (rs.next()){
//            author_id = rs.getInt("id");
//            author_name = rs.getString("name");
//            author_email = rs.getString("email");
//            author_password = rs.getString("password");
//            System.out.println(author_id + author_name + author_email + author_password);
//    }

//        int author_id =0;
//        String author_name ="hong";
//        String author_email="hong@naver.com";
//        String author_password="";
//        Statement st = con.createStatement();
////        String myQuery = "SELECT * FROM author where name=" + author_name + " and email=" + author_email;
//        String myQuery = "SELECT * FROM author where name=\"" +author_name+ "\" and email=\"" + author_email+"\"";
//        ResultSet rs = st.executeQuery(myQuery);
//        while (rs.next()) {
//            author_id = rs.getInt("id");
//            author_name = rs.getString("name");
//            author_email = rs.getString("email");
//            author_password = rs.getString("password");
//            System.out.println(author_id + author_name + author_email + author_password);
//        }

        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081 서비스 시작");
        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null && !line.isEmpty()) {
                sb.append(line + "\n");
            }

            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            System.out.println(infos);
            String id = "";
            if(infos.contains("?")){
                String st1 = infos.split("\\?")[1]; // 원래 split 뒤에 인덱스 값이 오나요 ?
                String[] stArr = st1.split("&");
                for(String s : stArr){
                    String[] keyValue = s.split("=");
                    if(keyValue[0].equals("id")){
                        id = keyValue[1]; // if 문 밖에서 선언한 String id
                    }
                }
            }
            System.out.println("id : " + id);
            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "hello world" + id;
            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush();
            socket.close();
        }




    }
}

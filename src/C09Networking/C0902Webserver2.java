package C09Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class C0902Webserver2 {
    public static void main(String[] args) throws IOException {
//        소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝점을 나타내는 개념
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081서비스 시작");
        while (true) {
//            accept() 클라이언트의 연결 요청을 수락
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine())!= null && !line.isEmpty()) {
                sb.append(line + "\n");
            }
            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            String id="";
            if(infos.contains("?")){
                String st1 = infos.split("\\?")[1];
                String[] stArr = st1.split("&");
                for(String a : stArr){
                    String[] keyvalue = a.split("=");
                    if(keyvalue[0].equals(id)){
                        id = keyvalue[1];
                    }
                }
            }
            System.out.println("id : " + id);
//            System.out.println(infos);
//            System.out.println(requestString);
//            UTF-8문자열 return
            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "hello world";
            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
//            flush 란 일반적으로 변경사항을 확정(반영)하는 것을 의미
            socket.getOutputStream().flush();
            socket.close();
        }
    }
}

//
//
//package C09NetWorking;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.nio.charset.StandardCharsets;
//
//public class C0901Webserver2 {
//    public static void main(String[] args) throws IOException {
//        ServerSocket serverSocket = new ServerSocket(8081);
//
//        System.out.println("8081 서비스 시작");
//        while (true) {
//            Socket socket = serverSocket.accept();
//            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            StringBuilder sb = new StringBuilder();
//            String line;
//
//            while ((line = br.readLine()) != null && !line.isEmpty()) {
//                sb.append(line + "\n");
//            }
//
//            String requestString = sb.toString();
//            String firstLine = requestString.split("\n")[0];
//            String infos = firstLine.split(" ")[1];
//            System.out.println(infos);
//            String id = "";
//            if(infos.contains("?")){
//                String st1 = infos.split("\\?")[1]; // 원래 split 뒤에 인덱스 값이 오나요 ?
//                String[] stArr = st1.split("&");
//                for(String s : stArr){
//                    String[] keyValue = s.split("=");
//                    if(keyValue[0].equals("id")){
//                        id = keyValue[1]; // if 문 밖에서 선언한 String id
//                    }
//                }
//            }
//            System.out.println("id : " + id);
//            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "hello world" + id;
//            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
//            socket.getOutputStream().flush();
//            socket.close();
//        }
//    }
//}


package C09Networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;

public class C0901Webserver1 {
    public static void main(String[] args) throws IOException {
//        소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝점을 나타내는 개념
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081서비스 시작");
        while (true){
//            accept() 클라이언트의 연결 요청을 수락
            Socket socket = serverSocket.accept();
//            UTF-8문자열 return
            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "hello world";
            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
//            flush 란 일반적으로 변경사항을 확정(반영)하는 것을 의미
            socket.getOutputStream().flush();
            socket.close();
        }
    }
}

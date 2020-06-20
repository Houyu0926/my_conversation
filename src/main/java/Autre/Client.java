package Autre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
    public static final int port = 8080;
    public static final String host = "localhost";
    public static void main(String[] args) {
        System.out.println("Autre.Client Start...");
        while (true) {
            Socket socket = null;
            try {
                //创建一个流套接字并将其连接到指定主机上的指定端口号
                socket = new Socket(host,port);

                //读取服务器端数据
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //向服务器端发送数据
                PrintStream out = new PrintStream(socket.getOutputStream());
                System.out.print("Please enter text: \t");
                String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
                out.println(str);

                String ret = input.readLine();
                System.out.println("The server returned is: " + ret);
                // 如接收到 "OK" 则断开连接
                if ("OK".equals(ret)) {
                    System.out.println("The client will close the conversation");
                    Thread.sleep(500);
                    break;
                }

                out.close();
                input.close();
            } catch (Exception e) {
                System.out.println("Autre.Client exception:" + e.getMessage());
            } finally {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        socket = null;
                        System.out.println("Autre.Client exception finally:" + e.getMessage());
                    }
                }
            }
        }
    }
}

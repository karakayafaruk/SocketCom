/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketcom;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ofk
 */
public class Server {
    
    private Socket socket=null;
    private ServerSocket s_socket= null;
    private DataInputStream in=null;
    
    public Server(int port){
        
        try {
            s_socket=new ServerSocket(port);
            System.out.println("server started");
            System.out.println("waiting for clients");
            socket=s_socket.accept();
            System.out.println("client connected");
            
            //taking data from client
            in=new DataInputStream(
            new BufferedInputStream(socket.getInputStream()));
            String message="";
            while (!message.equals("over")) {
                try {
                    messag=in.readUTF()
                    System.out.println(message);
                } catch (Exception e) {
                    System.out.println(e);
                }
                
            }
            
            System.out.println("closing connection");
            socket.close();
            in.close();
                  
        } catch (Exception e) {
            System.out.println(e);
        }
             
            
            
            
}
    
} 

import java.net.*;
public class EchoServer {
    public static void main(String[] args) {
        System.out.println("Waiting for client!!");
       try{
        ServerSocket ss = new ServerSocket(4806);
        Socket soc2 = ss.accept();
        System.out.println("Connection established!!");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
}

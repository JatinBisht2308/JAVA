import java.net.*;
public class EchoClient {
    public static void main(String[] args) {
        System.out.println("Client Started!!");
        try{
            // creating a socket
        Socket soc = new Socket("localhost",4806);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

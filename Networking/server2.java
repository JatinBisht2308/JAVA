import java.io.*;
import java.net.*;

public class server2 {
    public static void main(String[] args) {
        System.out.println("Waiting for client!!!!");
        try{
            ServerSocket ss = new ServerSocket(2308);
            System.out.println("Kaha ka client ha tu sale!!!!");
            Socket s1 = ss.accept();
            System.out.println("Jaldi batata kyu na haiii !!!!!");
            DataInputStream dis = new DataInputStream(s1.getInputStream());
            String message = (String)dis.readUTF();
            System.out.println(message);
//            System.out.println(dis.readUTF());
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}

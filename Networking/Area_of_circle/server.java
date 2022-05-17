package Area_of_circle;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(1111);
            Socket s1 = ss.accept();
//            Taking input as the radius
            DataInputStream dis = new DataInputStream(s1.getInputStream());
            int radius = dis.readInt();
            System.out.println("got the radius!!!!");
//            Sending back the area of the circle to the client
            DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
            System.out.println("sended the calculated area!!!!!");
            dos.writeDouble((3.14 * radius * radius));
            dos.flush();
            ss.close();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

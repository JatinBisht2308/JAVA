import java.net.Socket;
import java.io.*;
public class client2 {
    public static void main(String[] args) {
        System.out.println("Ruko adhaar card se batata hu !!!!");
        try{
            Socket s1 = new Socket("localhost",2308);
            DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
            dos.writeUTF("Dilli se hu bc!!!");
            dos.flush();
            s1.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

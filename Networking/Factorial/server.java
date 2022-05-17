package Factorial;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws Exception{

        ServerSocket ss = new ServerSocket(2222);
        Socket s1 = ss.accept();
        DataInputStream dis = new DataInputStream(s1.getInputStream());
        int num = dis.readInt();
//        calculating its factorial
        long factorial = fact(num);
//        sending this answer to the client
        DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
        dos.writeLong(factorial);
        ss.close();
    }
    public static long fact(int num)
    {
        long factorial = 1;
        for(int i=num;i>0;i--)
        {
            factorial*=i;
        }
        return factorial;
    }
}

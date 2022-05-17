package Factorial;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost",2222);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number-> ");
        int num = scan.nextInt();
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeInt(num);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        System.out.println(dis.readLong());
        dos.flush();
        s.close();
    }
}

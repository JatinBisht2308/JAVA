package Area_of_circle;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try {
            Socket s1 = new Socket("localhost",1111);
//            Taking input from console to get the radius
            System.out.println("Enter the radius of the circle->");
            Scanner scan = new Scanner(System.in);
            int radius = scan.nextInt();
//            Sending this radius to the server to calculate the area
            DataOutputStream dos = new DataOutputStream(s1.getOutputStream());
//            writeInt() method to parse integer value to the server and UTF to parse String value
            dos.writeInt(radius);
            dos.flush();
//           Taking input from the server
            DataInputStream dis = new DataInputStream(s1.getInputStream());
            double ans = dis.readDouble();
            System.out.println("Area of the circle is-> "+ans);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}

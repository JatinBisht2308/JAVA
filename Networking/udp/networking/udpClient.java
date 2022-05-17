package udp.networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udpClient {
    public static void main(String[] args) throws Exception {
//        make datagram socket
        DatagramSocket ds = new DatagramSocket();
         String data = "jatin bisht";

//         host name -> to send the data to the particular host name
        InetAddress ia = InetAddress.getLocalHost();
//        packet will have data, data length, hostname/address, port number
        DatagramPacket dp = new DatagramPacket(data.getBytes(),data.length(),ia,2308);
//        sending the packet through socket(ds)
        ds.send(dp);

//        receive the calculated data from the server
//        int[] arr = new int[5-> length of the array];
        byte[] b1 = new byte[1024];
//        receiving will have 2-> data variable, variable length(byte array length)
        DatagramPacket dp1 = new DatagramPacket(b1,b1.length);
//        receive method to receive the data
        ds.receive(dp1);
        String str = new String(dp1.getData(),0,dp1.getLength());
        System.out.println(str);
    }
}

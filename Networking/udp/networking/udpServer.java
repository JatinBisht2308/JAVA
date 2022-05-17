package udp.networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udpServer {
    public static void main(String[] args) throws Exception {
//        make socket datagram one
        DatagramSocket ds  = new DatagramSocket(2308);
//        accept data from the client we need packet(receiving will have 2 args)
        byte[] b1 = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b1,b1.length);
        ds.receive(dp);

        String str = new String(dp.getData(),0,dp.getLength());
//        to reverse
        StringBuilder stb = new StringBuilder(str);
        str = stb.reverse().toString();

//        send string back to the client
        InetAddress ia = InetAddress.getLocalHost();
        DatagramPacket dp1 = new DatagramPacket(str.getBytes(),str.length(),ia,dp.getPort());
        ds.send(dp1);
    }
}

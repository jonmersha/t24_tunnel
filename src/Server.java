import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8080);
        Socket s=ss.accept();
        //DataInputStream dis=new DataInputStream(s.getInputStream());
        //String  str=(String)dis.readUTF();
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        while (s.isConnected()){
            dout.writeUTF("Hello Server");
        }
    }


}

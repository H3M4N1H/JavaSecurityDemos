import java.net.*;
import java.io.*;
public class SimpleServer {
	public static void main(String[] a) throws Exception {
		ServerSocket ss = new ServerSocket(5000);
		while(true){
			Socket s = ss.accept();
			System.out.println("Client connected");
			BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter out = new PrintWriter(s.getOutputStream(),true);
			out.println(in.readLine().toUpperCase());
			s.close();
			}
		}
	}

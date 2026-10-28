import java.io.*;
import java.net.*;
public class DoSSimulator{
	public static void main(String[] a) throws Exception {
		for (int i=0;i<500;i++){
			Socket s = new Socket("localhost",5000);
			PrintWriter out = new PrintWriter(s.getOutputStream(),true);
			out.println("Request "+i);
			System.out.println(new BufferedReader( new InputStreamReader(s.getInputStream())).readLine());
			s.close();
			}
		}
	}

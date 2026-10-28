import java.io.*;
import java.security.*;
public class MD5CollisionDemo {
	static String hash(String f) throws Exception {
		MessageDigest m = MessageDigest.getInstance("MD5");
		byte[] b = new byte[1024];
		int n;
		try (FileInputStream in = new FileInputStream(f)) {
		while ((n=in.read(b)) !=-1){ m.update(b,0,n); }
		StringBuilder s = new StringBuilder();
			for (byte x : m.digest())
			s.append(String.format("%02x",x));
			return s.toString();
		} }
		public static void main(String[] a) throws Exception {
			String x = hash("file1.der"), y = hash("file2.der");
			System.out.println(x+"\n"+y);
			System.out.println(x.equals(y)?"Collision":"No Collision"); 
		}
	}

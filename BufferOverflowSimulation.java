import java.util.*;
public class BufferOverflowSimulation{
	public static void main(String[] a) {
		Scanner s=new Scanner(System.in);
		char[] b=new char[10];
		int secret = 0;
		String in = s.nextLine();
		for (int i=0;i<in.length();i++){
			if(i<b.length) b[i]=in.charAt(i);
			else{
				secret=12345;
				System.out.println("Overflow Triggered !");
				break;
				}
			}
			System.out.println(secret==12345?"Buffer Overflow Successful!" : "Try Again !");
		}
	} 

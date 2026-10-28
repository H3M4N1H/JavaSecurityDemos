import java.io.*;
public class BotnetDetection {
	public static void main(String[] a) throws Exception {
		BufferedReader br = new BufferedReader( new FileReader("dataset.csv"));
		String line;
		br.readLine();
		while ((line=br.readLine())!=null){
			String[] d = line.split(",");
			int size = Integer.parseInt(d[2].trim());
			String ip = d[1].trim();
			boolean bot = size > 1000 || ip.startsWith("185");
			System.out.println(d[0]+" "+ip+" "+(bot?"BOTNET":"Normal")+"Actual : " + d[3]);
			}
		br.close();
	}
}

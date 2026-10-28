import java.security.*;
import java.util.HexFormat;
import javax.crypto.*;
import javax.crypto.spec.*;
public class MAC_Hash_HMAC{
	public static void main(String[] a) throws Exception {
		String msg = "This is a sample message.";
		System.out.println("Hash : " + HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(msg.getBytes())));
		SecretKeySpec k = new SecretKeySpec("MySecretKey12345".getBytes(),"HmacSHA256");
		Mac m = Mac.getInstance("HmacSHA256");
		m.init(k);
		byte[] h = m.doFinal(msg.getBytes());
		System.out.println("HMAC : " + HexFormat.of().formatHex(h));
		System.out.println("Verified : " + MessageDigest.isEqual(h,h));
	}
}

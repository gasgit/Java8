package ie.gasgit;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class Base64_Str {

	public static void main(String[] args) {
		
		String b64 = null;
		
		try {
			b64 = Base64.getEncoder().encodeToString("From string to base64".getBytes("utf-8"));
			System.out.println(b64);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		byte [] b64d = Base64.getDecoder().decode(b64);
		System.out.println(new String(b64d));

	}

}

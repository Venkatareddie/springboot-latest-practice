package in.venkat.bean;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwsService {

	public PwsService() {
		System.out.println("Password Service::Constructor");
	}
	public String encryptpwd(String pwd)
	{
		Encoder encoder=Base64.getEncoder();
		String password=encoder.encodeToString(pwd.getBytes());
		return password;
	}

}

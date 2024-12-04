package in.venkat;

public class PwdServiceImpl implements IPwdService {

	public PwdServiceImpl() {
		System.out.println("Password::Constructor");
	}

	@Override
	public void restpwd() {
		System.out.println("Password reset successfully...");
	}

}

package in.venkat.bean;

public class UserService {
	
	private PwsService pwsService;

	public void setPwsService(PwsService pwsService) {
		System.out.println("Value injected...");
		this.pwsService = pwsService;
	}

	public UserService() {
		System.out.println("User Service::Constructor");
	}
	
	public void saveData(String username, String password)
	{
		String passwd=pwsService.encryptpwd(password);
		System.out.println("Encode:"+passwd);
		System.out.println("Record inserted into database...");
	}

}

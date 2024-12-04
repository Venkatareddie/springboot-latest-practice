package in.venkat;

public class UserService {

	private IPwdService iPwdService;
	private IUserDaoService iUserDaoService;
	private IEmailNotification iEmailNotification;

	public UserService(IPwdService iPwdService, IUserDaoService iUserDaoService,
			IEmailNotification iEmailNotification) {

		this.iPwdService = iPwdService;
		this.iUserDaoService = iUserDaoService;
		this.iEmailNotification = iEmailNotification;
	}

	public void registraction() {
		iPwdService.restpwd();
		iUserDaoService.saveData();
		iEmailNotification.Enotify();
	}

}

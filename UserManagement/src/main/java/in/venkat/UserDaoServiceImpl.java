package in.venkat;

public class UserDaoServiceImpl implements IUserDaoService {

	public UserDaoServiceImpl() {
		System.out.println("UserDao::Constructor");
	}

	@Override
	public void saveData() {
		System.out.println("Records successfully inserted....");

	}

}

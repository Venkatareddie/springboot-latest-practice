package in.venkat;

public class EmailNotificationServiceImpl implements IEmailNotification {

	public EmailNotificationServiceImpl() {
		System.out.println("Email Notification::Constructor");
	}

	@Override
	public void Enotify() {
		System.out.println("Email Notification Sended...");
	}

}

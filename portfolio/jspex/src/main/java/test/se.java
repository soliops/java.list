package test;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class se extends Authenticator{
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		String user = "opete2012";
		String pw = "soliops5857!@";
		return new PasswordAuthentication(user,pw);
	}
}

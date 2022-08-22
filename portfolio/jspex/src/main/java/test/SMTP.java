package test;
import javax.mail.*;

public class SMTP extends Authenticator{
	public PasswordAuthentication getPasswordAuthentication() {
		String username ="opete95@gmail.com";
		String password="soliops5857#!";
		return new PasswordAuthentication(username,password);
	}
}

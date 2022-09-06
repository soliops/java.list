package config;

import java.time.*;
import java.time.format.*;

public class datetimer {
	public String datetime = null;
	
	public String now_datetime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		this.datetime = now.format(dft);
		return this.datetime;
	}
	public String now_date() {
		LocalDate now = LocalDate.now();
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		this.datetime = now.format(dft);
		return this.datetime;
	}
	
	public String now_hour() {
		LocalTime now = LocalTime.now();
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("HH:mm:ss");
		this.datetime = now.format(dft);
		return this.datetime;
	}
	public String number() {
		String rnumber = "";
		for(int t=0;t<8;t++) {
			int num = (int)(Math.random()*10);
			rnumber+=num;
		}
		return rnumber;
	}
}

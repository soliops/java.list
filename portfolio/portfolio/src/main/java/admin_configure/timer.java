package admin_configure;

import java.time.*;
import java.time.format.*;

public class timer {
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
}

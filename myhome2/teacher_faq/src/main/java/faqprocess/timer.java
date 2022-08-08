package faqprocess;

import java.time.*;
import java.time.format.*;

public class timer {
	public String datetime = null;
	
	public String now_datetime() {//날짜+시간
		
		LocalDateTime lt = LocalDateTime.now();
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");		
		this.datetime = lt.format(fm);
		
		return this.datetime;
	}
	
	public String now_date() {	//날짜
		
		LocalDate lt = LocalDate.now();
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyy-MM-dd");		
		this.datetime = lt.format(fm);
		
		return this.datetime;
	}
	
	
}

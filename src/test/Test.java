package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");  
			Date date1 = sdf.parse("2019/01/02 16:30:00:98");
			Date date2 = sdf.parse("2019/01/04 15:31:00:100");
			System.out.println((date2.getTime()-date1.getTime())/60/60/1000);
		} catch (Exception e) {
			System.out.println("fas9usi");
			e.printStackTrace();
		}
	}
	
}

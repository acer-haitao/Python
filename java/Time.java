package cn.com.DIH;

import java.awt.image.SampleModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {
	public static void main(String[] args) {
		Date date = new Date();
		String format = "yyyy��MM��dd��   HHʱmm��ss�� a";
		SimpleDateFormat dateformat = new SimpleDateFormat(format);
		System.out.println(dateformat.format(date));
		
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("һ���еĵڣ�"+doy + "��");
	}
}
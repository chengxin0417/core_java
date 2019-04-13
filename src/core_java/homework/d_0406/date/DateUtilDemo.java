package core_java.homework.d_0406.date;

import java.text.ParseException;

import core_java.util.DateUtil;

public class DateUtilDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println(DateUtil.getCurrrentDate());
		System.out.println(DateUtil.dateFormat(DateUtil.getCurrrentDate(), DateUtil.DATE_PATTERN));
	}

}

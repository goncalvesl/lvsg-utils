package lvsg.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static final String	P_HH_MM_SS	= "HH:mm:ss";
	public static final String	P_FILE_NAME	= "yyyyMMdd-HHmm";

	public static Date convertDiaMesAno(String dataStr) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return new Date(format.parse(dataStr).getTime());
		} catch (ParseException e) {
			return null;
		}
	}

	public static String toStringFull(Date date) {
		if (date == null)
			return null;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return format.format(date);
	}

	public static String ConverteHH_MM_SS(Date date) {
		return toString(P_HH_MM_SS, date);
	}

	public static Date convertDiaMesAno(String dataStr, String hora) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		try {
			return new Date(format.parse(dataStr + " " + hora).getTime());
		} catch (ParseException e) {
			return null;
		}
	}

	public static String convertHoraMinuto(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		return format.format(date);
	}

	public static Date toDate(String pattern, String dataStr) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		try {
			return new Date(format.parse(dataStr).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String toString(String pattern, Date date) {
		if (date == null)
			return null;
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}

}

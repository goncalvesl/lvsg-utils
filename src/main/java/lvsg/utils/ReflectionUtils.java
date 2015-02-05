package lvsg.utils;

import java.lang.reflect.Field;

public class ReflectionUtils {

	public static Object getFieldValue(Field field, Object model) {
		Object fieldValue;
		try {
			fieldValue = field.get(model);
			return fieldValue;
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}

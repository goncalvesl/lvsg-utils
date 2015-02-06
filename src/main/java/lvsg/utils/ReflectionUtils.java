package lvsg.utils;

import java.lang.reflect.Field;

/**
 * Reflection Utilities
 * 
 * @author Lucas Gonçalves
 *
 */
public class ReflectionUtils {

	/**
	 * Get Field value without throw Exception.
	 * 
	 * @param field
	 * @param obj
	 * @return Value of field or Null if have any problem
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getFieldValue(Field field, Object obj) {
		T fieldValue;
		try {
			fieldValue = (T) field.get(obj);
			return fieldValue;
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}

package lvsg.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Utilities method for Maps
 * 
 * @author Lucas Gonçalves
 *
 */
public class MapUtil {

	/**
	 * Create Map filled with values. First value of array is key, second is the value, third is key...
	 * 
	 * @param objects
	 *            Keys and values
	 * @return HashMap filled.
	 */
	@SuppressWarnings("unchecked")
	public static <T, X> Map<T, X> createMap(Object... objects) {
		Map<T, X> map = new HashMap<>();
		for (int i = 0; i < objects.length; i++) {
			map.put((T) objects[i], (X) objects[++i]);
		}
		return map;
	}

	/**
	 * Return a new Map only with specific keys.
	 * 
	 * @param map
	 *            that will be filtered
	 * @param containKeys
	 *            keys that filtered returned map will have.
	 * @return new HashMap filtered
	 */
	public static <T, V> Map<T, V> filterByKey(Map<String, V> map, Collection<T> containKeys) {
		Map<T, V> res = new HashMap<>();
		for (T key : containKeys)
			if (map.containsKey(key)) res.put(key, map.get(key));

		return res;
	}
}

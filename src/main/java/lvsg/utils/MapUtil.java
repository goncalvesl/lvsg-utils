package lvsg.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapUtil {
	public static Map<String, Object> createMap(Object... objects) {
		Map<String, Object> map = new HashMap<>();
		for (int i = 0; i < objects.length; i++) {
			map.put((String) objects[i], objects[++i]);
		}
		return map;
	}

	public static <T> Map<T, Object> filterByKey(Map<String, Object> all, Collection<T> containKeys) {
		Map<T, Object> res = new HashMap<T, Object>();
		for (T key : containKeys)
			if (all.containsKey(key))
				res.put(key, all.get(key));

		return res;
	}
}

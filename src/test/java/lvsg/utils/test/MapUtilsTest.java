package lvsg.utils.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import lvsg.utils.MapUtil;

import org.junit.Assert;
import org.junit.Test;

public class MapUtilsTest {

	@Test
	public void createMap() {
		Map<String, Integer> returnMap1 = MapUtil.createMap("key1", 1, "key2", 2);
		Assert.assertTrue(returnMap1.containsKey("key1"));
		Assert.assertTrue(returnMap1.containsKey("key2"));
		Assert.assertEquals(returnMap1.size(), 2);
	}

	@Test
	public void filterByKey() {
		Map<String, Integer> map = MapUtil.createMap("key1", 1, "key2", 2);
		Collection<String> keys = new ArrayList<>();
		keys.add("key1");

		Map<String, Integer> res = MapUtil.filterByKey(map, keys);
		Assert.assertEquals(res.size(), 1);
		Assert.assertTrue(map.containsKey("key1"));

	}
}

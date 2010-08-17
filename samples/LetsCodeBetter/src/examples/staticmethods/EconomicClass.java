package examples.staticmethods;

import java.util.HashMap;
import java.util.Map;

public class EconomicClass {

	public static void main(String[] args) {
		final VeryExpensiveObject o1 = VeryExpensiveObject.create("12");
		final VeryExpensiveObject o2 = VeryExpensiveObject.create("12");
		System.out.println(o1 == o2);
	}
}

class VeryExpensiveObject {

	private static Map<String, VeryExpensiveObject> map = new HashMap<String, VeryExpensiveObject>();

	public VeryExpensiveObject(String code) {
		System.out.println("Creating very expensive object with code: " + code);
	}

	public static VeryExpensiveObject create(String code) {
		cache(code);
		return cached(code);
	}

	private static VeryExpensiveObject cached(String code) {
		return map.get(code);
	}

	private static void cache(String code) {
		if (!map.containsKey(code)) {
			map.put(code, new VeryExpensiveObject(code));
		}
	}

}

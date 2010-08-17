package examples.gc;

public class GCBuddy {

	public static void main(String[] args) {
		strings();
		autoboxing();
	}

	private static void autoboxing() {
		badAutoBoxing();
		goodAutoBoxing();

	}

	private static void badAutoBoxing() {
		long time = System.currentTimeMillis();
		Long l = 0l;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			l += i;
		}
		System.out.println("Elapsed bad: "
				+ (System.currentTimeMillis() - time));

	}

	private static void goodAutoBoxing() {
		long time = System.currentTimeMillis();
		long l = 0l;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			l += i;
		}
		System.out.println("Elapsed good: "
				+ (System.currentTimeMillis() - time));
	}

	private static void strings() {
		stringConcat();
		stringBuiler();
	}

	private static void stringBuiler() {

		long time = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		;
		for (int i = 0; i < 15000; i++) {
			builder.append(i);
		}
		System.out.println("Elapsed string: "
				+ (System.currentTimeMillis() - time));
	}

	private static void stringConcat() {
		long time = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < 15000; i++) {
			s += i;
		}
		System.out.println("Elapsed string: "
				+ (System.currentTimeMillis() - time));
	}
}

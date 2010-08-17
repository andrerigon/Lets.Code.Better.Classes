package examples.builder;

@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) {
		final BadLED bad = new BadLED(0, 1, 12, 45, 1, 5, 6, 8, 0, 4);

		final GoodLED good = GoodLED.BUILDER.initPosition(0, 1)
				.finalPosition(12, 45).backgroundRGBColor(1, 5, 6)
				.backgroundRGBColor(8, 0, 4).build();

	}
}

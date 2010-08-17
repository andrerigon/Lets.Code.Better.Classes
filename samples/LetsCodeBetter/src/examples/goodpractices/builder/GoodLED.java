package examples.goodpractices.builder;

@SuppressWarnings("unused")
public class GoodLED {

	private final int x0;
	private final int y0;
	private final int xN;
	private final int yN;
	private final int backgroundRColor;
	private final int backgroundGColor;
	private final int backgroundBColor;
	private final int ledRColor;
	private final int ledGColor;
	private final int ledBColor;

	private GoodLED(Builder builder) {
		x0 = builder.x0;
		y0 = builder.y0;
		xN = builder.xN;
		yN = builder.yN;
		backgroundRColor = builder.backgroundRColor;
		backgroundGColor = builder.backgroundGColor;
		backgroundBColor = builder.backgroundBColor;
		ledRColor = builder.ledRColor;
		ledGColor = builder.ledGColor;
		ledBColor = builder.ledBColor;
	}

	public static final Builder BUILDER = new Builder();

	public static class Builder {
		private int x0;
		private int y0;
		private int xN;
		private int yN;
		private int backgroundRColor;
		private int backgroundGColor;
		private int backgroundBColor;
		private int ledRColor;
		private int ledGColor;
		private int ledBColor;

		private Builder() {
		}

		public Builder initPosition(int x, int y) {
			this.x0 = x;
			this.y0 = y;
			return this;
		}

		public Builder finalPosition(int x, int y) {
			this.xN = x;
			this.yN = y;
			return this;
		}

		public Builder backgroundRGBColor(int r, int g, int b) {
			this.backgroundRColor = r;
			this.backgroundGColor = g;
			this.backgroundBColor = b;
			return this;
		}

		public Builder ledRGBColor(int r, int g, int b) {
			this.ledRColor = r;
			this.ledGColor = g;
			this.ledBColor = b;
			return this;
		}

		public GoodLED build() {
			return new GoodLED(this);
		}
	}
}

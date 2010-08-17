package examples.goodpractices.builder;

@SuppressWarnings("unused")
public class BadLED {

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

	public BadLED(int x0, int y0, int xN, int yN, int backgroundRColor,
			int backgroundGColor, int backgroundBColor, int ledRColor,
			int ledGColor, int ledBColor) {
		super();
		this.x0 = x0;
		this.y0 = y0;
		this.xN = xN;
		this.yN = yN;
		this.backgroundRColor = backgroundRColor;
		this.backgroundGColor = backgroundGColor;
		this.backgroundBColor = backgroundBColor;
		this.ledRColor = ledRColor;
		this.ledGColor = ledGColor;
		this.ledBColor = ledBColor;
	}

}

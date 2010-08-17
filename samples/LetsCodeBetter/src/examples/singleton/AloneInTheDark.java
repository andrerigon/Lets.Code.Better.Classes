package examples.singleton;

public class AloneInTheDark {

	public static void main(String[] args) {
		TimeGrandeDeSaoPauloSemLibertadores naoTemPassaporte = TimeGrandeDeSaoPauloSemLibertadores.CORINTHIANS;

		System.out.println(naoTemPassaporte);
	}
}

enum TimeGrandeDeSaoPauloSemLibertadores {
	CORINTHIANS;
}

enum CopType {
	BAD, GOOD;
}
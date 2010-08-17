package examples.goodpractices.staticmethods;

public class GoodNames {
	
	public static void main(String[] args) {
		final Credit credit = Credit.newPrePaidWithDescription("meu credito");
		credit.hashCode();
	}

}

class Credit {

	private final String desc;

	private final Type type;

	private Credit(String desc, Type type) {
		this.desc = desc;
		this.type = type;
	}
	
	public static Credit newPrePaidWithDescription(String desc) {
		return new Credit(desc, Type.PRE_PAID);
	}

	public static Credit newPostPaidWithDescription(String desc) {
		return new Credit(desc, Type.POST_PAID);
	}

	private enum Type {
		PRE_PAID, POST_PAID;
	}

	public String getDesc() {
		return desc;
	}

	public boolean isPrePaid() {
		return type == Type.PRE_PAID;
	}
}
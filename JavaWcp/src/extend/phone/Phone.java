package extend.phone;

public interface Phone {
//	int MAX_NUMBER_DIGITS = 11;
//
//	public void call(String number);

	final int MAX_NUMBER_DIGITS = 11;

	void call(String number);

	default void powerOff() {
		System.out.println("電源を切ります。");
	}
}

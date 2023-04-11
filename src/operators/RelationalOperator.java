package operators;

public class RelationalOperator {

	public static void main(String[] args) {
		System.out.println(20 > 10);
		System.out.println(20 >= 10);
		System.out.println(20 < 10);
		System.out.println(20 <= 10);
		System.out.println(20 == 10);
		System.out.println(20 != 10);

		int a = 10;
		int b = 20;
		System.out.println("*******************" + (a == b));
		System.out.println("*******************" + (a != b));
		System.out.println("*******************" + (a >= b));
		System.out.println("*******************" + (a > b));
		System.out.println("*******************" + (a <= b));
		System.out.println("*******************" + (a < b));
	}

}

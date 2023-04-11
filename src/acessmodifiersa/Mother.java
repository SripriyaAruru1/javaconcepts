package acessmodifiersa;

public class Mother {
	
	private int a = 10;
	int b = 20;
	public int c = 30;
	protected int d = 40;
	
 public static void main(String[] args) {
	
	 Mother obj = new Mother();
	 System.out.println(obj.a);
	 System.out.println(obj.b);
	 System.out.println(obj.c);
	 System.out.println(obj.d);
}

}

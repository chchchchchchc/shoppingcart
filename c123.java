
public class c123 {
	String c1;
	String c2;
	public c123(String c1, String c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	public void display() {
		System.out.println(this);
		System.out.println(c1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c123 a = new c123("123", "456");
		c123 b = new c123("134", "436");
		b.display();
		a.display();
	}

}

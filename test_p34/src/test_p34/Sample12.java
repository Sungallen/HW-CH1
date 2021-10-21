package test_p34;

public class Sample12 {

	public static void main(String[] args) {
		int fig1 = 23;
		int fig2 = 34;
		
		System.out.println("fig1和fig2的各種運算");
		System.out.println("fig1 + fig2 = "+(fig1 + fig2));
		System.out.println("fig1 - fig2 = "+(fig1 - fig2));
		System.out.println("fig1 x fig2 = "+(fig1 * fig2));
		System.out.println("fig1 / fig2 = "+(fig1 / fig2));
		System.out.println("fig1 % fig2 = "+(fig1 % fig2));
		
		int x = 0, y = 0, z = 0;
		
		y = x++;
		z = ++x;
		System.out.println("遞增x前給y，y的值"+y);
		System.out.println("遞增x後給z，z的值"+z);
	}

}

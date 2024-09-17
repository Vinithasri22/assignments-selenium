package homeassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1 ;
		int num3;
		
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 2; i <= 8; i++) {
			num3 = num1+num2;
			num1 =num2;
			num2 = num3;
			System.out.println(num3);
		}

	}

}

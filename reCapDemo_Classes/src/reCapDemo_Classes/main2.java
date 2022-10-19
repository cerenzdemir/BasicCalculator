package reCapDemo_Classes;

public class main2 {

	public static void main(String[] args) {
		FourTransection fourTransection = new FourTransection();
		int result = fourTransection.Sum(3, 4);
		int result2= fourTransection.Sub(23, 10);
		int result3=fourTransection.Multiply(3, 10);
		int result4=fourTransection.Divide(40,5);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}

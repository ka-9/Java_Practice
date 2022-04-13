public class Test3 {
	public static void main (String[] args) {
		int num1, num2, num3;

		num1 = (int) (Math.random()*90 + 10);
		num2 = (int) (Math.random()*90 + 10);
		num3 = (int) (Math.random()*90 + 10);

		int rightDigit1, rightDigit2, rightDigit3;
	
		rightDigit1 = num1 % 10;
		rightDigit2 = num2 % 10;
		rightDigit3 = num3 % 10;

		int minRightDigits = Math.min(rightDigit1, Math.min(rightDigit2, rightDigit3));

		int leftDigit1, leftDigit2, leftDigit3;

		leftDigit1 = num1 / 10;
		leftDigit2 = num2 / 10;
		leftDigit3 = num3 / 10;

		int maxLeftDigits = Math.max(leftDigit1, Math.max(leftDigit2, leftDigit3));

		System.out.println("First random number between 10 and 99: " + num1);
		System.out.println("Second random number between 10 and 99: " + num2);
		System.out.println("Third random number between 10 and 99: " + num3);
		System.out.println("Min between rightmost digits: " + minRightDigits);
		System.out.println("Max between leftmost digits: " + maxLeftDigits);


	}
}
		
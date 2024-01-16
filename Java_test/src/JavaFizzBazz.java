
public class JavaFizzBazz {
	public static void main(String[]args) {
		System.out.println("数字を入力してください");
		int num = new java.util.Scanner(System.in).nextInt();
		if (num % 15 == 0) {
			System.out.println("FizzBuzz");
		}else if(num % 5 == 0){
			System.out.println("Buzz");
		}else if(num % 3 == 0) {
			System.out.println("Fizz");
		}else {
			System.out.println(num + "は該当なし");
		}
	}
}

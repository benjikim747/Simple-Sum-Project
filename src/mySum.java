import java.util.Scanner;

public class mySum {
	public static void main(String[] args) {
		System.out.print(" 합을 구할 두 수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(" 두 수의 합은 :" + (num1 + num2) + "입니다.");
	}
}

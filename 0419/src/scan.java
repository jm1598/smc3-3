import java.util.Scanner;
public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("1000 이하의 자연수를 입력하세요.");
		int a = scan.nextInt();
		int sum = 0;
		int b = 0;
		for(b=1; b<=a; b++) {
			
		if(b%4==0) {
			sum=b+sum;
		}
		} 
		System.out.println("1~"+a+"까지 4의 배수의 합은 "+sum+"입니다.");
	} 

}

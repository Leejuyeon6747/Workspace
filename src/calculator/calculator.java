package calculator;
import java.util.Scanner;
public class calculator {	
	public int calc(int x, int y, int c) {
		
		int sum=0;
		switch(c) {
		case 1:
			sum = x+y;
//			System.out.println(x+"+"+ y + "="+sum);
			break;
		case 2://
			sum = x-y;
//			System.out.println(x+"-"+ y + "="+sum);
			break;
		case 3:
			sum = x*y;
//			System.out.println(x+"*"+ y + "="+sum);
			break;
		case 4:
			sum = x/y;
//			System.out.println(x+"/"+ y + "="+sum);
			break;
		default:
			System.out.println("연산기호 잘못 입력. 프로그램 종료");
			break;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int i = sc.nextInt();
		calculator c = new calculator();
		int cal;
		do {
			System.out.println("1. 더하기, 2, 뺴기, 3.곱하기, 4.나누기 를 선택하세요");
			cal = sc.nextInt();
			System.out.println("정수를 입력하세요");
			int n =sc.nextInt();
			switch(cal) {
			case 1:
				System.out.println("결과:"+ c.calc(i, n, cal));
				break;
			case 2:
				System.out.println("결과:"+ c.calc(i, n, cal));
				break;
			case 3:
				System.out.println("결과:"+ c.calc(i, n, cal));
				break;
			case 4:
				System.out.println("결과:"+ c.calc(i, n, cal));
				break;
			default:
				System.out.println("연산기호 잘못 입력. 프로그램 종료");
				break;
			}	
			i=c.calc(i, n, cal);
		}while(cal != 4);
		
		
		}
	}



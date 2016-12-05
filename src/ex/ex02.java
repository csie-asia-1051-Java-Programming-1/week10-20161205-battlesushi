package ex;
import java.util.Scanner;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021030 張廷毓
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		if(a<=120){
			System.out.print(a*2.10f);
			System.out.print(a*2.10f);
		}
		else if(a>120&&a<=330){
			System.out.print(a*3.02f);
			System.out.print(a*2.68f);
		}
		else if(a>330&&a<=500){
			System.out.print(a*4.39f);
			System.out.print(a*3.61f);
		}
		else if(a>500&&a<=700){
			System.out.print(a*4.97f);
			System.out.print(a*4.01f);
		}
		else{
			System.out.print(a*5.63f);
			System.out.print(a*4.50f);
		}
		
	}

}

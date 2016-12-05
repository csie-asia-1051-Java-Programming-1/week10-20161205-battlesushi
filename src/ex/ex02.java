package ex;
import java.util.Scanner;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021030 張廷毓
 */
public class ex02 {//部分 乘上其電費金額
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		if(a<=120){
			System.out.println(a*2.10f);
			System.out.println(a*2.10f);
		}
		else if(a>120&&a<=330){
			System.out.println(120*2.10f+(a-120)*3.02f);
			System.out.println(120*2.10f+(a-120)*2.68f);
		}
		else if(a>330&&a<=500){
			System.out.println(120*2.10f+210*3.02f+(a-330)*4.39f);
			System.out.println(120*2.10f+210*2.68f+(a-330)*3.61f);
		}
		else if(a>500&&a<=700){
			System.out.println(120*2.10f+210*3.02f+170*4.39f+(a-500)*4.97f);
			System.out.println(120*2.10f+210*2.68f+170*3.61f+(a-500)*4.01f);
		}
		else{
			System.out.println();
			System.out.println();
			System.out.println(120*2.10f+210*3.02f+170*4.39f+200*4.97f+(a-700)*5.63f);
			System.out.println(120*2.10f+210*2.68f+170*3.61f+200*4.01f+(a-700)*4.50f);
		}
		
	}

}

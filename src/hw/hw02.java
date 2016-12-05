package hw;
import java.util.Scanner;
/*
 * 有一種坊間常見的遊戲稱為 "18 啦 "~ 玩法介紹 : 由四個骰子來擲，只要其中任兩個是相同點，
 * 才開始計算點數，點數即為另兩個點數相加，若另兩個也一樣，則取較 大的一組相加，
 * 另外有下列幾種特殊情況:
	擲出 4 顆骰子點數均相同，稱為通殺 !
	任三顆點數相同或四顆點數均不相同，即為無意義 ! 請寫一程式，各別輸入四顆骰子點數，判斷結果 !
 */
public class hw02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		if(n1==n2&&n3!=n4  &&n1!=n3&&n1!=n4)
			System.out.println(n3+n4);
		else if(n1==n3&&n2!=n4  &&n1!=n2&&n1!=n4)
			System.out.println(n2+n4);
		else if(n1==n4&&n2!=n3  &&n1!=n2&&n1!=n3)
			System.out.println(n2+n3);
		else if(n2==n3&&n1!=n4  &&n2!=n1&&n2!=n4)
			System.out.println(n1+n4);
		else if(n2==n4&&n1!=n3	&&n2!=n1&&n2!=n3)
			System.out.println(n1+n3);
		else if(n3==n4&&n1!=n2	&&n3!=n1&&n3!=n2)
			System.out.println(n1+n2);
		//////////////////////////////
		if(n1==n2&&n1==n3&&n1==n4)
			System.out.println("通殺");
		else if(n1==n2&&n3==n4  &&n1!=n3){
			if(n1>n3)
				System.out.println(n1+n2);
			else
				System.out.println(n3+n4);
		}
		else if(n1==n3&&n2==n4  &&n1!=n2){
			if(n1>n2)
				System.out.println(n1+n3);
			else
				System.out.println(n2+n4);
		}
		else if(n1==n4&&n2==n3  &&n1!=n2){
			if(n1>n2)
				System.out.println(n1+n4);
			else
				System.out.println(n2+n3);
		}
		else 
			System.out.println("無意義");
	}

}

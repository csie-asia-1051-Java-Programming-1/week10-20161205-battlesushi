package hw;
import java.util.Scanner;
/*
 * ���@�ا{���`�����C���٬� "18 �� "~ ���k���� : �ѥ|�ӻ�l���Y�A�u�n�䤤����ӬO�ۦP�I�A
 * �~�}�l�p���I�ơA�I�ƧY���t����I�Ƭۥ[�A�Y�t��Ӥ]�@�ˡA�h���� �j���@�լۥ[�A
 * �t�~���U�C�X�دS���p:
	�Y�X 4 ����l�I�Ƨ��ۦP�A�٬��q�� !
	���T���I�ƬۦP�Υ|���I�Ƨ����ۦP�A�Y���L�N�q ! �мg�@�{���A�U�O��J�|����l�I�ơA�P�_���G !
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
			System.out.println("�q��");
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
			System.out.println("�L�N�q");
	}

}

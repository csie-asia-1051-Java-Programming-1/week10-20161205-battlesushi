package hw;
import java.util.Scanner;
/*�Y���Ǯ��|��^���˩w����A�Y�O�ǥͳq�L�Ӵ���A�h��q�L���~���e�C�Ѯv�ǳƪ� �^����礤�����T�Ӷ��ط�@�ҸաA
 * ���O�Oť�O�B�\Ū�B�f���C�C�@�Ӷ��ش��纡�� �Ҭ� 100 ���A�`���� 300 ���C�Q�n�q�L���禳��ؤ覡�C
 * �覡�@:�Y�O�T�Ӷ��ؤ� �ƬҬ� 60 ���H�W ( �]�t 60 �� ) �Y���q�L����C
 * �覡�G:�Y�T�Ӷ��ؤ����䤤�@ �Ӷ��ؤ��ƥ��� 60 ���A���T�Ӷ��ؤ����`�X�W�L 220 ���A�]�i��q�L����C
 * �Y�T�Ӷ��ؤ����䤤�@�Ӷ��ؤ��ƥ��� 60 ���A�ӤT�Ӷ��ؤ����`�X�]�S��W�L 220 ���A�i��o�ɦҾ��|�C
 * �Y�O�T�Ӷ��ؤ�����Ӷ��ؤ��ή�A���t�@�Ӷ��ئ��Z���� 80 �� ( �]�t 80 �� ) �A�]�i��o�ɦҪ����|�C��l�ҧP�w���L�k�q�L����C
*����: �Ĥ@�欰�@�Ӿ�� N �A�N��@�� N �մ��ո�ơC���ᦳ N ��A�C�@�榳 3 �ӫD �t��� ( �d��Ҭ� 0 �� 100), 
*���O�N��ӦW�ǥ�ť�O�B�\Ū�B�f����������ơC
*�Y�O�q�L����A�h��X ��P�� �C�Y�O�ݭn�ɦҡA�h��X ��M�� �C�Y�O�L�k�q�L����A �h��X ��F��
*/
public class hw01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++){
			int m1=sc.nextInt();
			int m2=sc.nextInt();
			int m3=sc.nextInt();
			sum=m1+m2+m3;
			if(m1>=60&&m2>=60&&m3>=60)
				System.out.println("P");	
			else if(m1<0||m2<0||m3<0 || m1>100||m2>100||m3>100)
				System.out.println("���Z���~");
			else if(m1<60&&sum>220 ||m2<60&&sum>220 ||m3<60&&sum>220)//[�W�L]���t220,�P�@�~�Ϥ���ĳ�b��
				System.out.println("P");
			else if(m1<60&&sum<=220 ||m2<60&&sum<=220 ||m3<60&&sum<=220)
				System.out.println("M");
			else if(m1<60&&m2<60&&m3>=80 ||m1<60&&m2>=80&&m3<60 ||m1>=80&&m2<60&&m3<60)
				System.out.println("M");
			else
				System.out.println("F");
		}
		
		
		
		
	}
}

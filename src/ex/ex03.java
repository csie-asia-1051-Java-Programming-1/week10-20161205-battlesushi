package ex;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Topic: 請設計 Person 類別 (姓名,性別,身高,體重)，使用者可以新增個人資料，
 * 每新增一筆就會列出目前的資料串有哪些人，而這些資料請用插入排序法依每一個人的 BMI 值由大到小排序。
 * Date: 2016/12/05
 * Author: 105021030 張廷毓
 */
public class ex03 {							//W/H^2
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Person> list=new ArrayList<Person>();
	}
}

class Person{
private String name;
private String sex;
private float height,weight;
}
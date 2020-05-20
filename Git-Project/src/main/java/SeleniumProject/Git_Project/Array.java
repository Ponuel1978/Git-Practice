package SeleniumProject.Git_Project;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int [] a= {8,9,10,40,30,22};
		System.out.println(a[0]);//for each position print
		for(int i=0;i<=a.length; i++){
		System.out.println(i);//full length  	
		System.out.println("-----------------------------");
		int max=Arrays.stream(a).max().getAsInt();
		System.out.println("max = "+ max);
		int max1=Arrays.stream(a).max().getAsInt();
		System.out.println("max = "+ max1);
		System.out.println("-------------------------------");	
		int min1=Arrays.stream(a).min().getAsInt();
		System.out.println("min =" + min1);
		}
	}

}

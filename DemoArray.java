package day2;

import day2.Date;

public class DemoArray {

	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5};
		
		for(int i=0;i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		//for(DateType var : collection)
		for(int x : arr)
		{
			System.out.println(x);
		}
		Date [] darr = new Date[2];
		darr[0] = new Date();
		darr[1] = new Date();
		darr[0].setDay(1);
		darr[1].setDay(2);
		for(int i=0; i< darr.length;i++)
		{
			System.out.println(darr[i]);
		}

		Date dt [] = {new Date(10, "Feb", 2000), new Date()};
		
		for(Date d : dt)
		{
			System.out.println(d);
		}
	}

}

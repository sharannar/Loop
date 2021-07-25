import java.util.*;


 public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("myNumber");
		//array of 5 numbers and added the elements
     int numbers[]=new int[]{34,54,23,32,9};
     int smallest=numbers[0];
     int largest=numbers[0];
     int product=numbers[0];

     int sum= 34+54+23+32+9;



     for (int i=1;i<numbers.length;i++)
	 {
	 	if(numbers[i]>largest)
	 		largest=numbers[i];
	 	else if (numbers[i]<smallest)
	 		smallest=numbers[i];
	 }
     System.out.println("The largest number is:  "+largest);
		System.out.println("The smallest number is:"+smallest);
		System.out.println("The product number is:"+ product);
		System.out.println("The sum number is:"+sum);









	}




    }


package age;

import java.util.Scanner;

public class Ram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();
       
       if(age > 20) {
    	   System.out.println("Adult is not possible");
       }
       else {
    	   System.out.println("Not-Adult");
       }
	}

}

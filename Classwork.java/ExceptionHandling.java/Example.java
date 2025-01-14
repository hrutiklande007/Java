import java.util.Scanner;
import java.io.*;

class ValentineException extends IOException {

	ValentineException(String str) {
	
		super(str);
	}
}

class Date {

	public static void main(String[] args)throws ValentineException {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Fav day in Feb: ");

		int x = sc.nextInt();

		
		if(x == 14){
		
			throw new ValentineException("You don't have a gf");
		
		}

		if (0<x && x<29){
			System.out.println(x+ " Feb ");
		}else{
		
			System.out.println("Invalid Data");
		}
	}
}

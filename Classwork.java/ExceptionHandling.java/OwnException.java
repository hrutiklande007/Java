import java.util.Scanner;

class DataOverFlowException extends RuntimeException {

	DataOverFlowException(String msg) {
	
		super(msg);
	}
}

class DataUnderFlowException extends RuntimeException {

	DataUnderFlowException(String msg) {
	
		super(msg);
	}
}

class Own {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);

		int arr[] = new int[5];

		System.out.println("Enter the integer value: ");
		System.out.println("Note: 0 < element < 100");

		for (int i = 0; i < arr.length; i++){
		
			int data = sc.nextInt();

			if (data<0){
			
				throw new DataUnderFlowException("Data is less then 0");
			}
			if (data>100){
			
				throw new DataOverFlowException("Data is greater then 100");
			}
			arr[i]=data;
		}

		for (int i =0 ; i<arr.length; i++){
		
			System.out.print(arr[i]+ " ");
		}
	}
}

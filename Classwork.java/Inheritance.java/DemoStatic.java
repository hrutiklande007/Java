class Parent{
	int x =10;
	static int y = 20;

	Parent(){
	
		System.out.println("Parent.");
	}

	void fun(){
	
		System.out.println("In Fun.");
	}

	static void run(){
	
		System.out.println("Static-Run.");
	}


}

class Child extends Parent{


}

class Client{

	public static void main(String[] args){
	
		Child obj = new Child();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
	}
}

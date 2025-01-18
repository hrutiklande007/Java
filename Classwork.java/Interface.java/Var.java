interface Demo {
	int x = 10;

	void fun();
}

class DemoChild implements Demo {

	//int x  = 79;

	public void fun() {
	
		//int x  = 79;
		System.out.println(Demo.x);
		System.out.println(x);
	}
}

class Client {

	public static void main(String[] args) {
	
		Demo obj = new DemoChild();
		obj.fun();
	}

}

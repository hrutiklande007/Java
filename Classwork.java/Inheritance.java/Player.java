class Player{

	int JerNo = 0;
	String name = null;

	Player(int JerNo,String name){

		this.JerNo = JerNo;
		this.name = name;
		System.out.println("In Constructore");
	}

	void info(){
	
		System.out.println(JerNo + " = " + name);
	}
}

class Client{

	public static void main(String[] args){
	
		Player obj1 = new Player(18,"Virat");
		obj1.info();

		Player obj2 = new Player(45,"Rohit");
		obj2.info();

		Player obj3 = new Player(7,"MSD");
		obj3.info();
	}
}

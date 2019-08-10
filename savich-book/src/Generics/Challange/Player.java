package Generics.Challange;

public abstract  class Player {
	protected  String name ;
	protected int age;
	protected  double salary;
	private int playerNumber;
	
	public Player(String name ,int age,double salary , int playerNumber ){
	    setName(name);
		setAge(age);
		setSalary(salary);
		setPlayerNumber(playerNumber);
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age<=0){
			this.age = 0;
		}else {
			this.age = age;
		}
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		if(salary<=0){
		this.salary = 0;
		}else {
		this.salary = salary;
	}
	}
}

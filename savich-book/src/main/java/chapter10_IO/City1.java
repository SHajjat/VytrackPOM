package chapter10_IO;

public class City1 {
	String name; int population; double growthRate;
	public City1(String name , int population, double growthRate){
		this.name = name;
		this.population = population;
		this.growthRate = growthRate;
		
	}
	@Override
	public String toString() {
		return " name= " + name + "\n population= " + population + "\n growthRate= " + growthRate + "%";
	}
}

public class Animal implements Comparable<Animal>{

	int legs;
	String name;

	public String toString(){
		return name + " has " + legs + " legs.";
	}

	public int getLegs(){
		return this.legs;
	}
	public int compareTo(Animal a){
		return this.getLegs() - a.getLegs();	
	}
}
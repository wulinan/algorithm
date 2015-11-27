package sameTree100;

class Dog{
	String name;
	public Dog(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Solution {

    public static void main(String[] args){
    	Dog myDog = new Dog("Rover");
    	foo(myDog);
    	System.out.println(myDog.getName()); 
    }
    public static void foo(Dog someDog) {
        someDog.setName("Max");     // AAA
        someDog = new Dog("Fifi");  // BBB
        someDog.setName("Rowlf");   // CCC
    }
}

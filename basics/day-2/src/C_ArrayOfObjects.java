class Dog{
	 String color;	//instance variable
	 String name;
	 //Ctr
	 		// local variable
	 Dog(String dogName,  String dogColor){
		 name=dogName;
		 color=dogColor;
	 }
	 public void printDetails() {
		 System.out.println("color of this dog: "+ color+" name of the dog: "+ name);
	 }
}
public class C_ArrayOfObjects {

	public static void main(String[] args) {
//		Dog dogs[]=new Dog[3];
//		dogs[0]=new Dog("black");
//		dogs[1]=new Dog("while");
//		dogs[2]=new Dog("gray");
//		
//		for(Dog dog: dogs) {
//			dog.printDetails();
//		}
//		
		
		Dog dogs[]={new Dog("bholu","black"),new Dog("tiger",  "while"),new Dog("leelu",  "gray")};
		
		for(Dog dog: dogs) {
			dog.printDetails();
		}
		
	}
}

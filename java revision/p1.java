class Person {
    String name; int age;

    Person() {

	 this("Unknown",0);

System.out.println(name + " which is this "+ age);

 }

Person(String n, int a) { 
name = n; age = a;
System.out.println(name + " "+ age);

}
public static void main(String st[]){

	//Person a = new Person("rishi",40);
	
	Person a1 = new Person();

}
}

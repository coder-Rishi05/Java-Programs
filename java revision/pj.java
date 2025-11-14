class Calculator {

int a , b;

Calculator(){
System.out.println("java revision");
}

Calculator(int x){
System.out.println(" Val of x :  "+x);
}


int operate(int a, int b){
return a + b;

}

double operate(double a, double b) {
return a * b;
}

int operate(String s, int count){

int len = s.length();

for (int i = 0; i < len; i++){
	count++;
} 

return count;
}

public static void main(String st[]){

int c,d,e;

Calculator obj1 = new Calculator(20);
Calculator obj2 = new Calculator();

obj2.a = 200;
obj2.b = 100;

c = obj2.operate(10,20);


d = obj2.operate(10,20);

System.out.println("c and d values : " + c +  " " + d);

e = obj2.operate("rishabh",0);

System.out.println("no. of letters in string : " +  e);

}

}
// abstract keyword


abstract class a {

int p;

abstract void disp();

void sound(){};

}


class b extends a {

void disp(){
}

}


class c {

public static void main(String s[]){

b obj = new b();
obj.sound();

}
}


// if i dont know some function creation but i want to fix the name of the function then i will create the abstract class. 
// i can have abstract class without abstract function. i do this when i don't want to create object of my class.
// 
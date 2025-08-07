java errors : 


error 1 : not typeconversion on loosing the data.

D:\JAVA\java notepad programms>javac var.java
var.java:6: error: incompatible types: possible lossy conversion from int to byte
byte a  = 1001;
          ^
1 error

error 2 : not initialised variable

D:\JAVA\java notepad programms>javac var.java
var.java:9: error: variable a might not have been initialized
System.out.print(a);
                 ^
1 error

error 3 : type conversion

D:\JAVA\java notepad programms>javac type.java
type.java:6: error: incompatible types: possible lossy conversion from int to char
char h = 650000;
         ^
1 error

error 4 : const variable : final a = 67;

D:\JAVA\java notepad programms>java b
type conversion of 65 to : A
const variable using final keyword: 23
D:\JAVA\java notepad programms>javac type.java
type.java:9: error: cannot assign a value to final variable a
a = 36;
^
1 error
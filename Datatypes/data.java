class data {
public static void main(String[] args){
// byte holds maximum value of -128 to 127
byte a = 127;
// short can store more than byte from -32,768 to 32,767
short b = 128;
/*
int is a data type where we can store from -2,147,483,648 to
2,147,483,647  int consumes 4 bytes of memory 
*/
int c = 25;
/*
 long can store data of - 9 cr to 9 cr long consumes 8
bytes of memory 
*/
long d = 68872;
/*
float used for decimal values and float doest consider a decimal value as float
you need to mention f at the end and float only can store value upto 1 to 6 after
point
*/
float a1 = 20.346783f;
//double can store value upto 1 to 10 from decimal point
double a2 = 10.376767637;
//char is used for storing a single letter using single cotation
char a3 = 'M';
/*
 charAt() is a function where you can collect a single letter from a string in 
numerical order from 0 and you cant give number that not available string value exception
*/
String a4 = "madrid";
// boolean used for true or false mostly it usefull in if else method
boolean b1 = true;
boolean b2 = false;
System.out.println( a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(a1);
System.out.println(a2);
System.out.println(a3);
System.out.println(a4.charAt(4));
System.out.println(b1);
System.out.println(b2);
}
}

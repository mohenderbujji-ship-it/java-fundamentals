import java.util.Scanner;
class Operators{
public static void main(String [] args){
// used && conditional operators its search both values should be true 
boolean movie = true;
boolean withfriends = false;
if(movie && withfriends)
System.out.println("yes lets watch");
else{
System.out.println("no dont watch");
}                              
// using && operator to see the number divisible by both the 3 and 5 or not
int a = 30;
if(a%3==0 && a%5==0)
System.out.println("yest its divisible");
else{
System.out.println("no its not divisible");
}
// || its the conditional operator used to find atleast one true in two values 
boolean madrid =true;
boolean barcelona= false;
if (madrid || barcelona)
System.out.println("yes friends");
else{
System.out.println("no friends");
} 
// using conditional operators finding odd number or even number
Scanner Scan = new Scanner(System.in);
int a1 = Scan.nextInt();
if(a1%2==0)
System.out.println("its even number");
else{
System.out.println("its odd number");
}   
Scan.close();                                          
}
}
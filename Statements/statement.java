//if else methods by using int and string in various methods and possibilities
import java.util.Scanner;
class statement{
public static void main(String args[]){
int a = 34;
int b = 69;
if(a>b) // if else practice using comparison operators
System.out.println("number 1 is greater");
else{
System.out.println("number 2 is greater");
}
if(a==b)
System.out.println("yes its same ");
else{
System.out.println("no its not ");
}
Scanner sath = new Scanner(System.in);
Boolean really = sath.nextBoolean();//if else using boolean true or false statements
if (really)
System.out.println("yes am sure");
else{
System.out.println("no am not sure");
}
Scanner math = new Scanner(System.in);//again comparison but using scanner method getting input from user
int num1 = math.nextInt();
int num2 = math.nextInt();
if (num1==num2){
System.out.println("yes both values are equal");
}
else{
System.out.println("no both are not same");
}
//if else using string with comparison operator
String a1 = "orange";
String a2 = "orange";
if(a1 == a2)
System.out.println("same");
else{
System.out.println("not same");
}
String a3 = new String ("orange");
String a4 = new String("orange");
if( a3.equals(a4))/*
in string the java doest compare the values its compare the refference(address of the value)
in that case we use function called [equals()]
*/
System.out.println("same");
else{
System.out.println("not same");
}
Scanner cup = new Scanner(System.in);// in string if else we doing this by gettin input from the user
String RCB = cup.nextLine();
if (RCB.equals("win"))
System.out.println("esala cup namde");
else{
System.out.println("esala cup lolipupu");
}
String meghana = "dead";
if (meghana.equals("dead"))
System.out.println("surya wedds ramya");
else{
System.out.println("surya wedds meghna");
}
}
}
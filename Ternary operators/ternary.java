import java.util.Scanner;
class ternary{
public static void main(String[]args){
int a = 30;
int b = 60;
String result= a>b? a+" is greater":b+" is greater";// ternary operator using string inside int 
System.out.println(result);
int num = a>b? a:b;// ternary operator using int 
System.out.println(num);
String num1= (60%2==0)? "even":"odd";
System.out.println(num1);
Scanner scan = new Scanner(System.in);
int z = scan.nextInt();
int x = scan.nextInt();
int y = scan.nextInt();
String math = (z==x && z==y)? "everything is same":
              (x==z && x==y)? String.valueOf(x):
              (z>=x && z>=y)?String.valueOf(z):
              (x>=z&& x>=y)?String.valueOf(x):
              String.valueOf(y);
System.out.println(math);
scan.close();
}
} 

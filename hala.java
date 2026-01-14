import java.util.Scanner;
class hala {
public static void main(String [] args){
Scanner details = new Scanner(System.in);
String name = details.nextLine();
double score= details.nextDouble();
details.nextLine();
String department= details.nextLine();
System.out.println("my name is "+name);
System.out.println("my score is "+score/10 +"/10");
System.out.print("am from "+department+" department");
}
}

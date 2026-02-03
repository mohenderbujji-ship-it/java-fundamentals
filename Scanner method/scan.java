import java.util.Scanner;
// scanner is used for getting input from user through terminal
class scan {
public static void main(String [] args){
Scanner details = new Scanner(System.in);
String name = details.nextLine();
double score= details.nextDouble();
details.nextLine();
String department= details.nextLine();
System.out.println("My name is "+name);
System.out.println("My score is "+score/10 +"/10");
System.out.print("Am from "+department+" department");
details.close();
}
}
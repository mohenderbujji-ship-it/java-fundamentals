import java.util.Scanner;
class parameters
{
 void chocolate (int money)
{
if (money==30){

 System.out.println( "chocolate purchased");
}
else if(money>=30)
{
System.out.println("chocolate purchased");
System.out.println(money - 30 + " remaining amount transfered ");
}
else{
System.out.println("insufficiant balance");
}
}

 void powder (int money)
{
if(money==35)
{
System.out.println(" powder purchased ");
}
else if (money>=35)
{
System.out.println("powder purchased");
System.out.println( money - 35  +" remaining money transferd");
}
else{
System.out.println("insuffisiant balance");
}
}
public static void main (String args[])
{
Scanner dollor = new Scanner(System.in);
parameters purchasing = new parameters();

System.out.println("ender amount for chocolate");

int choco = dollor.nextInt();

purchasing.chocolate(choco);

System.out.println("enter amount for powder");

int cosm = dollor.nextInt();

purchasing.powder(cosm);
dollor.close();
}
}
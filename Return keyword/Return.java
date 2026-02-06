class Return{
int sum (int a, int b )
{
int c = (b-a);
return c;
}
String name(String bio)
{
return bio;
}
public static void main(String args[]){
Return math = new Return();
int sub = math.sum(20,40);
System.out.println(sub);
String identification = math.name("mohender");
System.out.println(identification);
}
}
class Functions1
{ 

//we can create multiple functions blocks inside the class and also can call them like this
void iphone()
{
System.out.println("this is iphone");
 samsung();
}
void samsung()
{
System.out.println("this is samsung");
redmi();
// i can even call functions by storing a method inside a method block
}
void redmi()
{
System.out.println("this is redmi");
}
public static void main(String args[])
{
// to call the function that outside of the method block we need to use object

Functions1 mobiles = new Functions1 ();
mobiles.iphone();
 // this is how we can use blocks inside functions and objects ect.....
  
}
}
 // lets do an example code 

class Functions2 
{
int a = 10;
int b = 20;

void sum()
{
System.out.println(a+b);
}
public static void main(String args[])
{
Functions2 add = new Functions2();
add.sum();
}
}
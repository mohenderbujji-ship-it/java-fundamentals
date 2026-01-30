class ObjectUse
{
// object mostly used to store a values and can use it whenever we want 
// details of the car by using one class variables by using objects
/*
 in global variable that have default values 
but in main method it wont have
*/
String name = "";
int speed =0;
String colour ="";
int price =0;
/*
once we created variables in class we can access 
it anytime by using object
*/ 
public static void main(String args[])
{
ObjectUse car1 = new ObjectUse();

car1.name = "honda";
car1.speed = 250;
car1.colour = "blue";
car1.price = 500000;
 
System.out.println(car1.speed);

// here I can use same variables for second objects too 

ObjectUse car2 = new ObjectUse();

car2.name = "lambourgini";
car2.speed = 350;
car2.colour = "red";
car2.price = 1034566;

ObjectUse car3 = new ObjectUse();
/*
 here I didt assign any value for car3 so when I print
 colour it printed the default value 
*/

System.out.println(car3.price);

System.out.println(car2.name);
// this is why we use object in oop in java
}
}

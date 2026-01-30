class Objects
{
/*
 object is used for calling the variables from class and 
store it in heap we use new key word to create an abject 
*/
String name ="mohender";
String company = "Accenture";
byte age = 21;
int experience = 12;
// now lets create the main method 
public static void main(String args[])
  {
    // creating an object to store the whole class inside the object 
 
    Objects employe = new Objects();
   
//.. now this object (employe) stores the class data in heap 
// to call the variables inside the employe we need to use .

    System.out.println(employe);

 // if i printed the object name alone it will print me the address of the head    
 // to access the inner variable of the object we need to use (.)

    System.out.println(employe.age);
 
  }  

}
import java.util.Scanner;
class loop
{
public static void main (String [] args)
{//for loop for repeating the name
    for( int a=1;a<=7;a=a+1){
System.out.println("mohender");
}
//for loop for enter number from 1 to 10
 Scanner scan= new Scanner(System.in);
int b= scan.nextInt();
int c= scan.nextInt();
for(int num=b;num<=c;num=num+1){
System.out.println(num);
}// for loop to count even number in the list of numbers
int count = 0;

for (int i=1;i<=10;i=i+1){
if(i%2==0){
}

else{
count = count+1; 
}
}
System.out.println(count);
//for loop to find divisible numbers by 3 and 5  with in one to hundred numbers
for (int i=1;i<=100;i=i+1){
if(i%3==0 && i%5==0){
System.out.println(i); 
}
}
scan.close();
}
}
import java.util.Random;
/*while loop is do everything as for loop its mainly used
 for the value that we dont know the limit
 */ 
class While{
public static void main(String[]args){
Random rand= new Random();
int num = 0;
while(num!=20){
 num = rand.nextInt(40);
System.out.println(num);
}
//doing simple code using while loop
int i= 0;
while(i<=10){
System.out.println("hi bro"+ i);
i=i+1;
}
//doing nested while loop with some code
 int j=1;
 int q=0;
while(j<=4){
System.out.println("pattu"+ j);
 q=1;
  while(q<=2){
System.out.println("where?"+ q);
q=q+1;
}
j=j+1;
}
System.out.println("found"+q);
// here is do while loop where the code runs atleast once even the while condition is wrong
int z= 1;
do{
System.out.println("hi");
z=z+1;
}while(z<=0);
}
}

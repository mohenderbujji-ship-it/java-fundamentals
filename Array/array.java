import java.util.Scanner;
class array{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
// array only starts the value from 0 to ect...
System.out.println("print the size of an array ");
int num = scan.nextInt();
int[] love = new int[num];
for (int i=1;i<num;i=i+1){
love[i]=scan.nextInt();
}
for(int j=1;j<num;j=j+1){
System.out.print(love[j]);
if(j<num-1){
    System.out.print(",");
}
}
System.out.println();
// another way to use array the simple way but cant use define 
String[] movies={ "interstellar", "inception" , "darknight","momento","tenent"};
System.out.println(movies[3]);
scan.close();
}
}
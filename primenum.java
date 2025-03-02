
import java.util.Scanner;
public class primenum {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number :");
       int n =input.nextInt();
       int count=0;
       if (n==1 || n==0){
        System.out.println(n+" is not a prime number");
       }
       else{
        for(int i=2;i<=100;i++){
           if(n%i==0) {
            count++;
           } }   }
        if(count==1){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is a not prime number");
        }
    }
}

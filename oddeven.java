import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        int n;
System.out.println("Enter any number:");
Scanner r=new Scanner(System.in);
n=r.nextInt();
if(n%2==0)
{
    System.out.println("Even numer");

}
else{
    System.out.println("Odd Number");

}
    }
}

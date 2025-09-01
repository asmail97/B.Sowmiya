public import java.util.Scanner;
public class largeno {
    public static void main(String[] args)
    {    //find largest of three no
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest;
        if(a >= b && a >= c)
        {
            largest = a;
        }
        else if(b >= a && b >= c)
        {
           largest = b;
        }
        else
        {
            largest = c;
        }
        System.out.print("Largest no" + largest);
    }
}
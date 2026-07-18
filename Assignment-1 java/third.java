import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter an ending number: ");
        int end = sc.nextInt();
        boolean isPrime = true;
        for (int i = start; i <= end; i++){
            if (start < 2) {
            continue; }
            isPrime = true;
            for (int j = 2; j <= i; j++){
                if (i % j == 0 && i != j){
                    isPrime = false;
                    break;
                }
            }
         if(isPrime ){
                    System.out.println(i + " is prime");}
                }
        sc.close();
    }
}
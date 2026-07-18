import java.util.Scanner;
public class second {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();
    sc.close();
    for (int i=0;i<=10;i++){
        System.out.println(n +" * "+i+" = "+ n*i);
    }
}
}

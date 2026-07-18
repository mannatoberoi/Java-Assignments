import java.util.Scanner;
public class fifth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int start = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int end = sc.nextInt();
        for(int i = start; i<= end;i++){
            int temp = i;
            int sum = 0;
            while (temp>0){
            int fact = 1;
            int ld = temp%10;
            for(int j = 1;j<=ld;j++){
                fact = fact * j;}
                sum = sum + fact;
                temp = temp/10;}
                if(sum == i){
                     System.out.println(i);
                }
        }  
         sc.close();
    }
}

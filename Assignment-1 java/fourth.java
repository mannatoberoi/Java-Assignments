import java.util.Scanner;
public class fourth 
{
    public static void main(String[] args){
        System.out.println("You Have % Guesses!!!!");
        int count = 0;
        Scanner sc = new Scanner(System.in);
       int secretNumber = 21;
       for(int i = 0; i < 5; i++){
         int number = sc.nextInt();
         if(number < secretNumber){
            System.out.println("TOO LOW");
         }
        else if(number > secretNumber){
            System.out.println("TOO HIGH");
         }
         else if (number == secretNumber){
            count++;
            System.out.println("YAY! YOU GUESSED IT.");
            break;
       }}
       if(count ==0){
        System.out.println("Better Luck Next Time");
       }
       sc.close();
    
}
}

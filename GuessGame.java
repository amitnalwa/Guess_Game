import java.util.Random;
import java.util.Scanner;

 class random1{
    int calculate = 0;

    public void hint(int a , int b){               
    int sum = a-b;
    int d1;
    int d2;
    int d3;
    int d4;
    int d5;
    int d6;
    int d7;
    if (sum <= 15 && sum >= -15){
            d6 = 96;
            System.out.println("Your Guess is  : " + d6+"% Correct");
        }
           else if  (sum <= 7 && sum >= -7){
            d1 = 90;
            System.out.println("Your Guess is  : " + d1+"% Correct");
        }
               else if  (sum <= 3 && sum >= -3){
            d7 = 99;
            System.out.println("Your Guess is  : " + d7+"% Correct only 3 guess availabe : ");
        }
        else if (sum <= 25 && sum >= -25){
            d2 = 65;
            System.out.println("Your Guess is  : " + d2+"% Correct");
        }
        
         else if (sum <= 50 && sum >= -50){
            d3 = 45;
             System.out.println("Your Guess is  : " + d3+"% Correct");
        }
        
           else if (sum <= 80 && sum >= -80){
            d4 = 15;
             System.out.println("Your Guess is  : " + d4+"% Correct");
        }
        else if (sum <= 95 && sum >= -95){
            d5 = 4;
             System.out.println("Your Guess is  : " + d5+"% Correct");
        }
        
    }

    public void  guess(int a , int b){
    

    // System.out.println(sum);        

        if (a < b){
                System.out.println("Please Enter Small Value  : ");
                calculate +=1;
                hint(a,b);
        }
        else if (a>b) {
            System.out.println("Please Enter Large Value  : ");
                calculate +=1;
            hint(a,b);
        } 
            else if (a==b) {
                calculate +=1;
            System.out.println("Congratulation You Won And Your Attempt =  " + calculate);
            hint(a,b);
        } 
        
        
        else {
            System.out.println("You Enter Wrong input try again ! ");
                calculate +=1;
                System.out.println("YOur total input  " + calculate);
            
        }


    }
}

class GuessGame {
public static void main(String[] args){

    Random num = new Random();
    int number = num.nextInt(100);
    // System.out.println(number);

    Scanner i = new Scanner(System.in);
 

    random1 rands = new random1();
    System.out.println("Please Enter Value : ");
    // System.out.println(number);
 

while (true){
       
    int user = i.nextInt();
     rands.guess(number , user);


  if (number == user){
    break;
  }
    }  

}
}

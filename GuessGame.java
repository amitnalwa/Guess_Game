import java.util.Random;
import java.util.Scanner;

 class random1{
    int calculate = 0;
    public void  guess(int a , int b){
                
        if (a < b){
                System.out.println("Please Enter Small Value  : ");
                calculate +=1;
        }
        else if (a>b) {
            System.out.println("Please Enter Large Value  : ");
                calculate +=1;
            
        } 
            else if (a==b) {
                calculate +=1;
            System.out.println("Congratulation You Won And Your Attempt =  " + calculate);
            
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
 

while (true){
       
    int user = i.nextInt();
      rands.guess(number , user);

  if (number == user){
    break;
  }
    }  

}
}

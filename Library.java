import java.io.BufferedReader;
import java.io.BufferedWriter; 
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.IOException;

class Library{

  public static String issue1(String name, int Id, String IssueB) throws IOException{

        File Student = new File("Student.txt");
        if(Student.createNewFile()){
          System.out.println("File created: " + Student.getName());
        }
        else {

          
          FileWriter fw2 = new FileWriter(Student,true);
          fw2.write(" ");
          fw2.append("Student Name : " + name + ",  Student Id : "+Id +  ", Issue Book Name : "  +IssueB + "\n" );
          fw2.close();
        }

    return null;
    
  }
}


public class Project_Library {
    
  public static void main(String[] args) throws IOException {


    String arg[] = new String[3];

    arg[0] = "Math";
    arg[1] = "Computer";
    arg[2] = "Science";


    try {
      File myObj = new File("Library.txt");
        if(myObj.createNewFile()){
         System.out.println("File created: " + myObj.getName());
        }

        else{
            System.out.println("Alredy exist ");

            
            FileWriter fw = new FileWriter(myObj,true);
            
            // read    **************************************
            fw.write(" ");
            int lineNumber = 0;
            FileReader fileReader = new FileReader(myObj);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String b = "";
            String line;
            
            lineNumber++;
            while ((line = bufferedReader.readLine()) != null){
                // Check if the line contains the search item
                if (line.contains("Math")) {
                    // System.out.println("Found at line " + lineNumber + ": " + line);
                    b = line;
                    System.out.println(line);
                      }
                
                else{
                                    
      for(int i=0; i<arg.length; i++){
                fw.append(" " + (i+1) + " " + arg[i] + ",");
      }}}
                        
            
            Scanner Book = new Scanner(System.in);
            System.out.print("\n ****************************************\nEnter new Book  Enter : E  and e \n Issue Book For Enter : I and i \n Show Library Books : S and s \n  For Exit press Q and q \n Press :  ");
            
            // Enter Books 
          char ie = Book.next().charAt(0);
         if(ie=='E' ||  ie == 'e'){

            System.out.println("Enter New Book : ");
            Random rand = new Random();
            int number = rand.nextInt(1000);
            String Books1 = Book.next();
            fw.append(" " + number + " " + Books1 + ",");
            System.out.println("\nAdd Successfully ");

            }

            else if (ie=='Q' || ie=='q'){
              System.exit(ie);
            } 


   // Show Library Books :
          else if(ie=='S' ||  ie == 's'){
             System.out.println("************** Library Books ***************\n"+b);
             
          }

//               Issue Books By Student's  With id proof 
          else if(ie=='I' ||  ie == 'i'){
            
            Book.nextLine();
             System.out.print("************** Issue Book's **************** \nEnter Your Issue Book Name : ");
            String bookname = Book.nextLine();
            
            
            if (b.contains(bookname)){
                          
              System.out.print("Enter Student Name : ");
             String name = Book.nextLine();

              System.out.print("Enter Student Id : ");
             int Id = Book.nextInt();

              
             b.replace(bookname," ");

            Library obj = new Library();
             obj.issue1(name , Id , bookname);
              
            }
            else{
              System.out.println("\nYour Book Not Available In library Try Another Book : \n ");
              System.out.println("************** Library Books ***************\n"+b);
              System.exit(0);
            }    
            
             
          }

         

            else{
              System.out.println("Wrong input !");
              System.exit(ie);
            }            
             // apped true
            // BufferedWriter bw = new BufferedWriter(fw); 
    // bw.newLine();
            fw.close(); 
          }
          
        }
    catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}


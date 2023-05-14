package libary;
//import java.io.FileNotFoundException;
import java.util.Scanner;
import java.time.LocalDate;
import java.io.PrintWriter;
import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
public class Libary {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("LOGIN USERNAME");
        String username = input.next();
        System.out.println("LOGIN PASSWORD");
        String password = input.next();
        if(username.equals("admin")&& password.equals("123")){
            System.out.println("Access Granted ! Welcome");
            LocalDate dt = LocalDate.now();
            dt = LocalDate.now();
            System.out.println(dt);
//        try(PrintWriter out = new PrintWriter("Libaray Detail txt")){
        try(PrintWriter out = new PrintWriter("Library Detail txt")){
             System.out.println("Welcom");
             System.out.println("Please Select From The Following Option");
             System.out.println("******************");
             
             books ob = new books();
             students obStudent = new students();
             int Choice;
             int searchChoice;
             
            do{
               ob.dispMenu();
               Choice = input.nextInt();
               switch(Choice){
                    case 1:
                    book b=new book();
                    ob.addBook(b);
                    break;
                     
                    case 2:
                    ob.upgradeBookQty();
                    break;
                     
                    case 3:
                    System.out.println("Enter 1 to Search with Searial No.");
                    System.out.println("Enter 2 to search With Author Name (Full Name");
                    searchChoice = input.nextInt();
                         
                    switch(searchChoice){
                        case 1:
                        ob.searchBySno();
                         break;
                         case 2:
                         ob.searchByAuthorName();
                         }
                         break;
                     case 4:
                         ob.showAllBooks();
                         out.println(ob);
                         break;
                     case 5:
                         student s=new student();
                         obStudent.addStudent(s);
                         break;
                     case 6:
                         obStudent.showAllStudents();
                         out.println(obStudent);
                         break;
                     case 7:
                         obStudent.checkOutBook(ob);
                         out.println(ob);
                         break;
                     case 8:
                         obStudent.checkInBook(ob);
                         out.println(obStudent);
                         break;
                     case 0:
                        System.out.println("Thank u=you for visiting Libary");
                        break;
                     default:
                         System.out.println("CHOICE CHOULD BE BETWEEN 0 TO 8");
                    }
                }
             while(Choice != 0);
            }
        }
        else if(username.equals("admin")){
            System.out.println("Invalid Password");
        }
        else if(password.equals(123)){
        System.out.println("Invalid Username");
        }
        else{
            System.out.println("Invalid Username & PAssword");
            }
    }
}
//        catch (FileNotFoundException ex) {
//                Logger.getLogger(Libary.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
    


package libary;
import java.util.Scanner;

public class students extends Libary{
    Scanner input = new Scanner(System.in);
//    student theStudents[] = new student[50];
    student theStudents[] = new student[50];
    
    public static int count = 0;
    public void addStudent(student s){
        
        for(int i=0; i<count; i++){
            if(s.regNum.equalsIgnoreCase(theStudents[i].regNum)){
                System.out.println("Student of Reg Num "+s.regNum+ "is Already Registered");
                return;
            }
        }
        if(count<=50){
            theStudents[count] = s;
            count++;
        }
    }
    public void showAllStudents(){
//        System.out.println("Student Name \t\t Reg Number \t\t\ Father Name \t\t Contact \t\t University \t\t City \t\t Book of Interest");
           System.out.println("Student Name \\t\\t Reg Number \\t\\t\\ Father Name \\t\\t Contact \\t\\t University \\t\\t City \\t\\t Book of Interest");
        for(int i=0; i<count; i++){
            System.out.println(theStudents[i].studentName +"\t\t"+ theStudents[i].regNum +"\t\t"+ theStudents[i].fname+"\t\t"+theStudents[i].contact+"\t\t"+
                    theStudents[i].uni +"\t\t"+theStudents[i].city+"\t\t"+theStudents[i].bi);
        }
    }
    public int isStudents(){
        System.out.println("Enter Reg Number.");
        String regNum = input.nextLine();
        
        for(int i=0;i<count; i++){
            if(theStudents[i].regNum.equalsIgnoreCase(regNum)){
                return i;
            }
        }
        System.out.println("Student is not Registered.");
        System.out.println("Get Registered First.");
        return -1;
    }
    public void checkOutBook(books book){
        int studentIndex = this.isStudents();
        
        if(studentIndex != -1){
            System.out.println("Checking out");
            
            book.showAllBooks();
            book b=book.ckeckOutBook();
            System.out.println("Checking out");
            if(b != null){
                if(theStudents[studentIndex].booksCount <=3){
                    System.out.println("adding book");
                    theStudents[studentIndex].borrewedBooks[theStudents[studentIndex].booksCount]=b;
                    theStudents[studentIndex].booksCount++;
                    return;
                }
            }
             System.out.println("Book is not Available");
        }
    }
    public void checkInBook(books book){
        int studentIndex = this.isStudents();
        if(studentIndex != -1){
            System.out.println("S.No\t\tBook Name\t\tAuthor Name");
            student s=theStudents[studentIndex];
            for(int i=0; i<s.booksCount; i++){
                System.out.println(s.borrewedBooks[i].sNo+"\t\t"+s.borrewedBooks[i].bookName+"\t\t"+s.borrewedBooks[i].authorName);
            }
                System.out.println("Enter Serial Number of Book to be Checked in");
                int sNo = input.nextInt();
                for(int i=0; i<s.booksCount; i++){
                    if(sNo == s.borrewedBooks[i].sNo){
                      book.checkInBook(s.borrewedBooks[i]);
                      s.borrewedBooks[i]=null;
                        return;
                    }
                }
                System.out.println("Book of Serial "+sNo+"not Found");
            }
    }
}
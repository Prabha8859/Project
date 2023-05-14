package libary;
import java.util.Scanner;
public class student{
    Scanner input = new Scanner(System.in);
    String studentName, address,city,uni,bi;
    String regNum,fname;
    int contact;
    book borrewedBooks[] = new book[3];
    public int booksCount = 0;
    public student(){
        System.out.println("Enter Student Name:");
        this.studentName = input.nextLine();
        System.out.println("Enter Reg Number.");
        this.regNum = input.nextLine();
        System.out.println("Enter Father Name");
        this.fname = input.next();
        System.out.println("Enter Contact");
        this.contact = input.nextInt();
        System.out.println("Enter University Name");
        this.uni = input.next();
        System.out.println("Enter City Name");
        this.city = input.next();
        System.out.println("Book of Interest");
        this.bi = input.next();
    }
}
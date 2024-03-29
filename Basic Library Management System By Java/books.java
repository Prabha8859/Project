/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libary;

import java.util.Scanner;
public class books {
    Scanner input =new Scanner(System.in);
    book theBooks[] = new book[50];
    
    public static int count;
    public int compareBookObjects(book b1, book b2){
        if(b1.bookName.equalsIgnoreCase(b2.bookName)){
            
            System.out.println("Book of this Name Already Exists.");
            return 0;
        }
        if(b1.sNo == b2.sNo){
            System.out.println("Book of this Serial No Already EXists");
            return 0;
        }
        return 1;
    }
    public void addBook(book b){
        for(int i=0; i<count; i++){
            if(this.compareBookObjects(b, this.theBooks[i]) == 0)
             return;
        }
        if(count<50){
            theBooks[count] = b;
            count++;
        }else{
            System.out.println("No Sppace to Add More Books");
        }
    }
    public void searchBySno(){
        System.out.println("\t\t\t\tSearch By Serial Number\n");
        int sNo;
        System.out.println("Enter Serial No Book");
        sNo = input.nextInt();
        int flag = 0;
        System.out.println("S No \t\t Name \t\t Author\t\tAvailable Qty\t\tTotal Qty");
        for(int i=0;i<count;i++){
            if(sNo == theBooks[i].sNo){
                System.out.println(theBooks[i].sNo + "\t\t" +theBooks[i].bookName+"\t\t"+theBooks[i].authorName+"\t\t"+theBooks[i].bookQtyCopy+"\t\t"+theBooks[i].bookQty);
                flag++;
                return;
            }
        }
        if(flag == 0)
            System.out.println("No Book for Serial No "+sNo+"Found");
    }
    public void searchByAuthorName(){
        System.out.println("\t\t\t\tSEARCH BY AUTHORS NAME");
        input.nextLine();
        System.out.println("Enter Author Name");
        String authorName = input.nextLine();
        int flag = 0;
        System.out.println("S.No \t\t\t\tName \t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for(int i=0;i<count;i++){
            if(authorName.equalsIgnoreCase(theBooks[i].authorName)){
//                System.out.println(theBooks[i].sNo+\t\t+theBooks[i].bookName+"\t\t"+theBooks[i].authorName+"\t\t"+theBooks[i].bookQtyCopy+"\t\t"+theBook[i].bookQty);
                   System.out.println(theBooks[i].sNo + "\t\t" +theBooks[i].bookName+"\t\t"+theBooks[i].authorName+"\t\t"+theBooks[i].bookQtyCopy+"\t\t"+theBooks[i].bookQty);
                   
                flag++;
            }
        }
        if(flag == 0)
            System.out.println("No Books of"+authorName+"Found");
    }
    public void showAllBooks(){
        System.out.println("\t\t\t\tShowing All Books\n");
        System.out.println("S.No\t\tName\t\tAuhtor\t\tQty\t\tTotal Qty");
        for(int i=0; i<count; i++){
             System.out.println(theBooks[i].sNo + "\t\t" +theBooks[i].bookName+"\t\t"+theBooks[i].authorName+"\t\t"+theBooks[i].bookQtyCopy+"\t\t"+theBooks[i].bookQty);
             
        }
    }
    public void upgradeBookQty(){
        System.out.println("\t\t\t\tUpgrade Quantity Of A Book\n");
        System.out.println("Enter Serial No of Book");
        int sNo = input.nextInt();
        for(int i=0;i<count;i++){
            if(sNo == theBooks[i].sNo){
                System.out.println("Enter No ofBooks To be Added");
                int addingQty = input.nextInt();
                theBooks[i].bookQty += addingQty;
                theBooks[i].bookQtyCopy += addingQty;
                return;
            }
        }
    }
    public void dispMenu(){
        System.out.println("=================================");
        System.out.println("ENter 0 to Enxit Appliction");
        System.out.println("Enter 1 to Add new Book");
        System.out.println("Enter 2 to Update Quantity of a Book");
        System.out.println("Enter 3 To Serach a Book");
        System.out.println("Enter 4 to Show All Books");
        System.out.println("Enter 5 to Register Student");
        System.out.println("Enter 6 to Show All Registered Student");
        System.out.println("Enter 7 to Check Out Book");
        System.out.println("Enter 8 to Check In Book");
        System.out.println("-----------------------------");
    }
     public int isAvailable(int sNo){
         for(int i=0; i<count;i++){
             if(sNo == theBooks[i].sNo){
                 if(theBooks[i].bookQtyCopy>0){
                     System.out.println("Book is Available");
                     return i;
                 }
                 System.out.println("Book is unavailable");
                 return -1;
             }
         }
         System.out.println("No Book of Serial Number "+"Available in Libray");
         return -1;
     }
     public book checkOutBook(){
         System.out.println("Enter Serial No of Book to be Checked out");
         int sNo = input.nextInt();
         int bookIndex = isAvailable(sNo);
         if(bookIndex != -1){
             theBooks[bookIndex].bookQtyCopy--;
             return theBooks[bookIndex];
         }
         return null;
     }
     public void checkInBook(book b){
         for(int i=0; i<count;i++){
             if(b.equals(theBooks[i])){
                 theBooks[i].bookQtyCopy++;
                 return;
             }
         }
     }

    book ckeckOutBook() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

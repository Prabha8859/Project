/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital_Management;

/**
 *
 * @author Vaishno Computer
 */
import java.util.Scanner;
class staffTemp{
    public String sid, sname, desg, Gender;
    public int salary;
    public void new_staff()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        sid = input.nextLine();
        System.out.print("name:-");
        sname = input.nextLine();
        System.out.print("desigination:-");
        desg = input.nextLine();
        System.out.print("Gender:-");
        Gender = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
    }
}

public class staff extends staffTemp implements staffInterface
{
    public void staff_info()
    {
        System.out.println(sid + "\t" + sname + "\t" + Gender + "\t" + salary);
    }
}

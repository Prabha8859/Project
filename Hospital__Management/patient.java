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

public class patient implements patientInterface
{
    String pid, pname, disease, Gender, admit_status;
    int age;
    public void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("name:-");
        pname = input.nextLine();
        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("Gender:-");
        Gender = input.nextLine();
        System.out.print("admit_status:-");
        admit_status = input.nextLine();
        System.out.print("age:-");
        age = input.nextInt();
    }
    public void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + Gender + "      \t" + admit_status + "\t" + age);
    }
}
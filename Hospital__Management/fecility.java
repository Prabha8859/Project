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

public class fecility implements fecilityInterface
{
    String fec_name;
    public void add_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fec_name = input.nextLine();
    }
    public void show_feci()
    {
        System.out.println(fec_name);
    }
}

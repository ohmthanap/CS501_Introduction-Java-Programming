/* Thanapoom Phatthanaphan
 * This program contains the details of department and supervisor's name of each department.
 * It allows user to input a department's name that user wants to check the corresponding supervisor's name.
*/ 

import java.util.Scanner;
class Departments
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String[][] depts = new String[6][2]; 
      depts[0][0] = "Marketing";
      depts[0][1] = "Martinez";
      depts[1][0] = "Accounting";
      depts[1][1] = "Patel";
      depts[2][0] = "Human Resources";
      depts[2][1] = "Wong";
      depts[3][0] = "Information Services";
      depts[3][1] = "Deitrich";
      depts[4][0] = "Sales";
      depts[4][1] = "Lennon";
      depts[5][0] = "Technical Service";
      depts[5][1] = "Kevin";

      String entry, message = "Enter a department: ";
      int num, x;
      boolean isFound = false;
      while (!isFound)
      {
         System.out.print(message);
         entry = input.nextLine();
         for(x = 0; x < depts.length; ++x)
            if(entry.equalsIgnoreCase(depts[x][0]))
            {
               isFound = true;
               System.out.print("Dept: " + entry + "\nSupervisor: " + depts[x][1]);
               x = depts.length;
            }
         if(!isFound)
            System.out.print("Sorry - no such department \n");
      }
   }
}
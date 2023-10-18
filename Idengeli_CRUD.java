import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Idengeli_CRUD application to store, read, update and delete: name, age, food and occupation 
 */
public class Idengeli_CRUD {
     public static  void main(String[] args) {
          List<Idengeli> fam = new ArrayList<Idengeli>();
        //   List < Employee > c = new ArrayList 
          Scanner input1 = new Scanner(System.in);
        //   Scanner input2 = new Scanner(System.in);
          int ch;  // allows us enter the scanner int input from 1 to 4
          do {
            System.out.println("Please select CRUD operation below");
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. DELETE");
            System.out.println("5. UPDATE");
            ch = input1.nextInt();
            // input1.close();
            
            // input2.close();

            // Insert operation and we will use a switch statement to perform the crud based on the number entered
            switch (ch) {
                case 1:
                try {
                    
                    input1.nextLine();
                    
                     System.out.println("Enter first name");
                     String name = input1.nextLine();
                     System.out.println("enter age");
                     int age = input1.nextInt();
                     System.out.println("enter fave food");
                     String food = input1.nextLine();
                      input1.nextLine();
                     System.out.println("Enter networth");
                    int netWorth = input1.nextInt();
                    
                    // next we use the arraylist collection to add the scanner inputs 
                    fam.add(new Idengeli(name, age, food, netWorth));
                    System.out.println("-------------------");
                    System.out.println("Family record entered successfully");
                    System.out.println("-------------------");
                    // input1.close();
                } catch (Exception e) {
                   e.printStackTrace();
                   System.out.println("Error occured");
                } 
                finally{
                    System.out.println("Some code here");
                }
                    break;
                    //DISPLAY function:   below allows us to iterate through Idengeli to display
                    case 2:
                    System.out.println("----------------");
                    Iterator <Idengeli> i = fam.iterator();
                    while (i.hasNext()) {
                        Idengeli id = i.next();
                        System.out.println(id);                       
                    }  
                    System.out.println("----------------");
                    break;    
                    
                    // case 3 Read Operation to search for idengeli family member
                    case 3:
                    boolean foundIdengeli = false;
                    System.out.println("Enter first name to search");
                    String searchName = input1.nextLine();
                    System.out.println("-----------------");
                    i = fam.iterator();
                    while (i.hasNext()) {
                        Idengeli id = i.next();
                        if(id.getName() == searchName){
                            System.out.println(id);
                            foundIdengeli = false;
                        }
                    }
                    if(!foundIdengeli){
                        String x = "Family member not found";
                        System.out.println(x);
                    }
                    System.out.println("-----------------");
                    input1.close();
                    break;

                    // delete operation
                    // case 4:



                    

                default:
                    break;
            }

          } while (ch != 0);

     }
}
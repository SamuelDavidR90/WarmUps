
package MultipleConditionalWarmUp;

import java.util.Scanner;

public class IntegradorCondicionales {

    
    public static void main(String[] args) {
        Double salary = 0.0;
        int category;
        String occupation = "";
        String EmployeeName = "";
        
        System.out.println("1 shelf-stocker: $15890 + 10%");
        System.out.println("2 casiers: $25630.89");
        System.out.println("3 supervisors: $35560.20 - 11%");
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose the category to calculate");
        category = keyboard.nextInt();
        
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Write the employee name");
        EmployeeName = keyboard2.nextLine();
        
        
        if(category == 1){
            occupation = "shelf-stocker";
            salary = 15890 + (15890 * 0.10);
        }else{
            if(category == 2){
                occupation = "cassier";
                salary = 25630.89;
            }else{
                if(category ==3){
                    occupation = "supervisor";
                    salary = 35560.20 - (35560.20 * 0.11);
                }
            }
        }
        
        System.out.println("The Employee " + EmployeeName);
        System.out.println("performs as: " + occupation);
        System.out.println("at the moment has a salary of : usd " + salary);
    }
    
}

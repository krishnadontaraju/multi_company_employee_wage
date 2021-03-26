import java.util.Random;

public class employee_wage_OOP {

    public static void main(String[] args) {
        // Creating an Instance of class Employee_check
        Employee_check first_emp = new Employee_check();
        // Calling the attendance method on first_emp
        first_emp.attendance();


    }

    //Defining the class Employee_check
    public static class Employee_check {

        Employee_check(/*int i, int j*/){
            //Initializing the wage and working hours
            int working_hours = 8;
            int wage_per_hr = 20;

        }

        Random check = new Random();
        //Defining attendacne method
        public void attendance() {

            

            int checker =check.nextInt(2);
            //Marking the attendance of the employee
            if (checker == 1)
                System.out.println("THE EMPLOYEE IS PRESENT");
            else
                System.out.println("THE EMPLOYEE IS ABSENT");    
            
        }

    }

    
}

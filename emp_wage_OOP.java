import java.util.Random;

public class employee_wage_UC_4 {

    public static void main(String[] args) {
        // Creating an Instance of class Employee_check
        Employee_check first_emp = new Employee_check();
        // Calling the attendance method on first_emp
        first_emp.attendance();


    }

    //Defining the class Employee_check
    public static class Employee_check {

        int working_hours = 8;
        int wage_per_hr = 20;
        //Initializing part time hours
        int part_time_hrs = 4;
        int wage_today = 0;

        Random check = new Random();
        //Defining attendacne method
        public void attendance() {

            int checker =check.nextInt(3);
            //Marking the attendance of the employee
            switch(checker){
                case 0:
                    System.out.println("THE EMPLOYEE IS ABSENT,Wage for today is 0");
                    break;
                case 1:
                    wage_today = working_hours * wage_per_hr;
                    System.out.println("THE EMPLOYEE HAS DONE A FULL AND WAGE TODAY IS "+wage_today);
                    break;
                case 2 :
                    wage_today = working_hours * wage_per_hr;
                    System.out.println("THE EMPLOYE HAS DONE PART TIME AND THE WAGE FOR TODAY IS "+wage_today);
                    break;
                default:
                    break;            
            }
        }

    }
    
}

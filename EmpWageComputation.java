public class EmpWageComputation {
     public static void main(String[] args) {
//Print Welcome To EmpWageComputation Program
	 System.out.println("Welcome to Employee Wage Computation Program");
//Check Employee Is Present Or Absent
             //Constants
               int IS_FULL_TIME = 1;
               int IS_PART_TIME = 2;
               int EMP_RATE_PER_HOUR = 20;
              //Variable
                int empHrs = 0;
                int empWage = 0;

             //Computation
              double empCheck = Math.floor(Math.random() * 10) % 2;
              if (empCheck == IS_FULL_TIME)
                    System.out.println("Employee is Present");
              else
                    System.out.println("Employee is Abscent");
//Calculate Daily Employee Wage
              if (empCheck == IS_FULL_TIME)
                    empHrs = 8;
              else
                    empHrs = 0;
              empWage = empHrs * EMP_RATE_PER_HOUR;
              System.out.println("EmpWage: " +empWage);
//Add Parttime Employee Wage
                //Computation
                double empCheck1 = Math.floor(Math.random() * 10) % 3;
                if (empCheck1 == IS_PART_TIME)
                        empHrs = 4;
                else if (empCheck1 == IS_FULL_TIME)
                        empHrs = 8;
                else
                        empHrs = 0;
                empWage = empHrs * EMP_RATE_PER_HOUR;
                System.out.println("Employee Wage: " +empWage);
        }
}

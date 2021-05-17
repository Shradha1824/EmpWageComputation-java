public class EmpWageComputation {
     public static void main(String[] args) {
	 System.out.println("Welcome to Employee Wage Computation Program");
             //Constants
              int ATTENDANCE = 1;
             //Computation
              double empCheck = Math.floor(Math.random() * 10) % 2;
              if (empCheck == ATTENDANCE)
                    System.out.println("Employee is Present");
              else
                    System.out.println("Employee is Abscent");
        }
}


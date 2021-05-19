public class EmpWageComputation {
     public static final int IS_PART_TIME = 1;
     public static final int IS_FULL_TIME = 2;
     public static final int EMP_RATE_PER_HR = 20;
     public static final int NUM_OF_WORKING_DAYS = 2;
     public static final int MAX_HRS_IN_MONTH = 10;

     public static int computeEmpWage() {

//Print Welcome To EmpWageComputation Program
	      System.out.println("Welcome to Employee Wage Computation Program");

//Check Employee Is Present Or Absent
             //Constants
	      int ATTENDANCE = 1;
              int IS_FULL_TIME = 1;
              int IS_PART_TIME = 2;
              int EMP_RATE_PER_HOUR = 20;
              //Variable
              int empHrs = 0;
              int empWage = 0;
              int totalEmpWage = 0;
              int totalEmpHrs = 0;
              int totalWorkingDays = 0;

             //Computation
              double empCheck = Math.floor(Math.random() * 10) % 2;
              if (empCheck == ATTENDANCE)
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

//Using Switch Stmt Calculate Employee Wage
                //Computation
                int empCheck2 = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck2) {
                    case  2:
                        empHrs = 4;
                        break;
                     case 1:
                        empHrs = 8;
                        break;
                      default:
                        empHrs = 0;
                }
                empWage = empHrs * EMP_RATE_PER_HOUR;
                System.out.println("Emp-Wage: " +empWage);

//Calculate EmpWage For Month
                //Computation
                 for(int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
                   int empCheck3 = (int) Math.floor(Math.random() * 10) % 3;
                    switch (empCheck3) {
                       case  2:
                        empHrs = 4;
                        break;
                       case  1:
                        empHrs = 8;
                        break;
                       default:
                        empHrs = 0;
                }
                   empWage = empHrs * EMP_RATE_PER_HOUR;
                   totalEmpWage = totalEmpWage + empWage;
                   System.out.println("EmpWage: " +empWage);
         }
         System.out.println("Total EmpWage: " + totalEmpWage);

//Calculate EmpWage till a condition of total working hours or days is reached for a month
                //Computation
                while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
                   totalWorkingDays++;
                   int empCheck4 = (int) Math.floor(Math.random() * 10) % 3;
                   switch (empCheck4) {
                     case  1:
                        empHrs = 4;
                        break;
                     case 2:
                        empHrs = 8;
                        break;
                      default:
                        empHrs = 0;
                }
                totalEmpHrs += empHrs;
                System.out.println("Day#: " + totalWorkingDays + " EmpHrs: " + empHrs);
         }
         System.out.println("Total EmpWage: " + totalEmpWage);

//Calculate Total EmpWage using class method
	     while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
		totalWorkingDays++;
		int empCheck5 = (int) Math.floor(Math.random() * 10) % 3;
	          switch (empCheck5) {
	     	        case 1:
			  empHrs = 4;
			case 2:
			  empHrs = 8;
			default:
			  empHrs = 0;
		  }
		   totalEmpHrs += empHrs;
		   System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " +empHrs);
	     }
	      System.out.println("Total Emp Wage: " + totalEmpWage);
              return totalEmpWage;

	// public static void main(String[] args) {
	// computeEmpWage();
             while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
		totalWorkingDays++;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		    case 1:
		    	empHrs = 4;
		    	break;
		    case 2:
		    	empHrs = 8;
		    default:
		    	empHrs = 0;
		}

		totalEmpHrs += empHrs;
		System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " + empHrs);
	}

	int totalEmpWage = totalEmpHrs * empRatePerHour;
	System.out.println("Total Emp Wage for Company: " + company + " is: " + totalEmpWage);
	return totalEmpWage;

	public static void main(String[] args) {
        computeEmpWage();
	computeEmpWage("DMart", 20, 2, 10);
	computeEmpWage("Reliance", 10, 4, 20);
	}
   }

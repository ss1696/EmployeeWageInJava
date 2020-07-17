public class EmployeeWage {

	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int empRatePerHrs = 20;
	public static final int totalWorkDays = 20;
	public static final int maxWorkHrs = 100;
	public static String company="";

	public static int computeEmpWage(String company) {
	
		int empWorkHrs=0;
		int totalWorkingHrs=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;

		EmployeeWage.company=company;
		while(totalWorkingDays<totalWorkDays &&  totalWorkingHrs<=maxWorkHrs) {
			
			int empAttendance = (int)Math.floor(Math.random() *10)%3;
			
			switch(empAttendance){

                        case isFullTime:
                                        empWorkHrs=8;
                                        break;
                        case isPartTime:
                                        empWorkHrs=4;
                                        break;
                        default:
                                        empWorkHrs=0;
                        }

			if(empAttendance==1 || empAttendance==2){
				
				totalWorkingDays++;
				totalWorkingHrs=totalWorkingHrs+empWorkHrs;
				System.out.println("Days: "+totalWorkingDays+" Employee Hrs: "+empWorkHrs);

			}
		}
		
		return totalWorkingHrs*empRatePerHrs;
	}

	public static void main(String[] args) {

		int totalEmpWage=computeEmpWage("Sony");
		System.out.println("Total Emp Wage in "+EmployeeWage.company+" Company ="+totalEmpWage);

		int totalEmpWage=computeEmpWage("Samsung");
                System.out.println("Total Emp Wage in "+EmployeeWage.company+" Company $

	}

}

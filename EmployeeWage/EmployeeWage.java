public class EmpWage {

	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int empRatePerHrs = 20;
	public static final int totalWorkDays = 20;
	public static final int maxWorkHrs = 100;

	public static int computeEmpWage() {
	
		int empWorkHrs=0;
		int totalWorkingHrs=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;

		while(totalWorkingDays<totalWorkDays &&  totalWorkingHrs<=maxWorkHrs) {
			
			int empAttendance = (int)Math.floor(Math.random() *10)%3;
			
			switch(empAttendance){

                        case isFullTime:
                                        empWorkHrs=8;
                                        break;
                        case isPartTimr:
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
		
		totalEmpWape=totalWorkingHrs*empRatePerHrs;

		return totalEmpWage;

	}

	public static void main(String[] args) {

		int totalEmpWage=computeEmpWage();
		System.out.println("Total Emp Wage : "+totalEmpWage);
	}

}

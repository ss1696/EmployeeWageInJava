public class EmpWage {

	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int empRatePerHrs = 20;
	public static final int totalWorkingDays = 20;
	
	public static void main(String[] args) {
	
		int empWorkHrs=0;
		int empWage=0;
		int totalEmpWage=0;

		for() {
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

			empWage=empWorkHrs * empRatePerHrs;
			totalEmpWage+=empWage;
			System.out.println("Employee Wage: "+empWage);
		}

		System.out.println("Total Employe's Wage: "+totalEmpWage);
	}
}

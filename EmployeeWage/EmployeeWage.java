public class EmpWage {

	public static void main(String[] args) {
	
		int isFullTime=1;
		int isPartTime=2
		int empRatePerHrs=20;

		int empWorkHrs=0;
		int empWage=0;

		double empAttendance = Math.floor(Math.random() *10)%3;
	
		if(empAttendance == isFullTime)
		{
			empWorkHrs=8;
		}
		else if(empAttendance == isPartTime){
			empWorkHrs=4;
		}
		else
			empHrs = 0;
			empWage=empWorkHrs * empRatePerHrs;
			System.out.println("Employee Wage: "+empWage);
		}

}

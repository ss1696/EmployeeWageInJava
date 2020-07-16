public class EmpWage {

	public static void main(String[] args) {
	
		int isFullTime=1;
		int empRatePerHrs=20;

		int empWorkHrs=0;
		int empWage=0;

		double empAttendance = Math.floor(Math.random() *10)%2;
	
		if(empAttendance == isFullTime)
		{
			empWorkHrs=8;
		}
		else
			empWorkHrs=0;
			empWage=empWorkHrs * empRatePerHrs;
			System.out.println("Emp Wage: "+empWage);  
		}

}

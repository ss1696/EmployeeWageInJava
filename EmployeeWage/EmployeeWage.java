public class EmpWage {

	public static void main(String[] args) {
	
		int isFullTime=1;
		double empAttendance = Math.floor(Math.random() *10)%2;
	
		if(empAttendance == isFullTime)
		{
			System.out.println("Employee is Present");
		}
		else
			System.out.println("Employee is Abscent");

	}

}

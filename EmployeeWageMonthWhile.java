import java.util.Random;
public class EmployeeWageMonthWhile{
	public static int ratePerHr=20;
	public static int numOfWorkingDay=20;
	public static int maxHrInMonth=100;
	
	public static void main(String arg[]){
		int empCheck,workingHr=0,totalEmpWorkingHr=0,totalWorkingDays=0,totalEmpWage=0;
		
		while(totalEmpWorkingHr < maxHrInMonth && totalWorkingDays < numOfWorkingDay ){
			totalWorkingDays++;
			empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck){
	    	case 1:
			System.out.println("The Employee has Full-time.");
			workingHr=16;
			break;
			case 2:
			System.out.println("The Employee has Part-time");
			workingHr=8;
			break;
			default:
				System.out.println("The Employee is Absent.");
			}
			
			totalEmpWorkingHr+=workingHr;
			System.out.println("Days:"+totalWorkingDays+"Employee working hours:"+workingHr);
			}
			totalEmpWage = totalEmpWorkingHr*ratePerHr;
			System.out.println("Employee Wage:"+totalEmpWage);
		}
}

import java.util.Random;
public class EmployeeWageSwitch{
	public static void main(String arg[]){
		int empCheck,workingHr=0;
		int ratePerHr=20;
		int numOfWorkingDay=30;
		int salary=0;
		Random random=new Random();
		empCheck=random.nextInt(3);
		for(int day=0;day<numOfWorkingDay;day++){
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
			
			salary=ratePerHr*workingHr;
			System.out.println("EmployeeWage:"+salary);
		}
		System.out.println("Total Working Hours:"+salary);
		}
}

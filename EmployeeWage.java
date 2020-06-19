import java.util.Random;


import java.util.Random;
public class EmployeeWage{
	public static int ratePerHr=20;
	public static int numOfWorkingDay=20;
	public static int maxHrInMonth=10;
	
	public void getEmployeeWage(){
		int empCheck,workingHr=0,totalEmpWorkingHr=0,totalWorkingDays=0,totalEmpWage=0;
		
		while(totalEmpWorkingHr < maxHrInMonth && totalWorkingDays < numOfWorkingDay ){
			totalWorkingDays++;
			Random random=new Random();
			empCheck=random.nextInt(3);
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


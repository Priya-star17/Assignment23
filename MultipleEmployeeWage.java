import java.util.Random;

public class MultipleEmployeeWage {
	String companyName;
	int ratePerHr;
	int numOfWorkingDays;
	int maxHrInMonth;

	public MultipleEmployeeWage(String companyName,int ratePerHr,int numOfWorkingDays,int maxHrInMonth) {
		this.companyName=companyName;
		this.ratePerHr=ratePerHr;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHrInMonth=maxHrInMonth;
	}
	public double getEmployeeWage() {
		int empCheck,workingHr=0,totalEmpWorkingHr=0,totalWorkingDays=0,totalEmpWage=0;
		
		while(totalEmpWorkingHr <= maxHrInMonth && totalWorkingDays <= numOfWorkingDays ){
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
			System.out.println("Total Employee wage is" +totalEmpWage);
			return totalEmpWage;
				
	}
	@Override
	public String toString() {
		return "MultipleEmployeeWage [companyName=" + companyName + ", ratePerHr=" + ratePerHr + ", numOfWorkingDays="
				+ numOfWorkingDays + ", maxHrInMonth=" + maxHrInMonth + "]";
	}

}

import java.util.Random;
public class EmployeeWorkType{
	public static void main(String arg[]){
		int empCheck,workingHr=0;
		int ratePerHr=20;
		int salary=0;
		Random random=new Random();
		empCheck=random.nextInt(3);
		if (empCheck == 0)
      			System.out.println("The Employee is Absent.");
    		else if (empCheck == 1)
			workingHr=8;
			 salary=ratePerHr*workingHr;
      			System.out.println("The Employee has Full-time."+salary);
		
		}
}

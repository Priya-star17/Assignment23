import java.util.ArrayList;
import java.util.List;

public class EmployeeWageStores implements CompanyWageImpl {
	
		public static final int Part_Time = 1; 
		public static final int Full_Time = 2; 


		List<CompanyEmpWageUsingInterface> companyEmpwageArray = new ArrayList<CompanyEmpWageUsingInterface> (); 
		List<Integer> daily_wages = new ArrayList<Integer> (); 
		public void addCompanyEmpWage(String company_name,int emp_rate_per_hour,int working_days,int max_hours_per_month){ 
			CompanyEmpWageUsingInterface emp = new CompanyEmpWageUsingInterface(company_name , emp_rate_per_hour , working_days , max_hours_per_month); 
			companyEmpwageArray.add(emp); 
		} 
		public void computeEmpwage(){ 
			for(int i = 0; i < companyEmpwageArray.size(); i++){ 
				companyEmpwageArray.get(i).seTtotalEmpwage(this.computeEmpwage(companyEmpwageArray.get(i))); 
				System.out.println(companyEmpwageArray.get(i)); 
			} 
		} 


		public void printDailyWage(){ 
			for(int i=0;i<daily_wages.size();i++){ 
				System.out.println(daily_wages.get(i)); 
			} 
		} 


		public int computeEmpwage(CompanyEmpWageUsingInterface companyEmpwageUC11){ 
			int hrs=0 , totalhrs=0, totalworkingdays=0; 
			while(totalhrs <= companyEmpwageUC11.max_hours_per_month && totalworkingdays < companyEmpwageUC11.working_days){ 
				totalworkingdays++; 
				int empcheck = (int) Math.floor(Math.random()*10)%3; 
				switch(empcheck){ 
					case Part_Time: 
						hrs=4; 
						break; 
					case Full_Time: 
						hrs=8; 
						break; 
					default: 
						hrs=0; 
				} 
				totalhrs += hrs; 
				daily_wages.add(hrs*20); 
				System.out.println("Day :" + totalworkingdays + "    " + "Emphrs :" + hrs +"     "+ "Daily wage=" + (hrs*20)); 
			} 
			return totalhrs * companyEmpwageUC11.emp_rate_per_hour; 
		} 
		public static void main(String[] args){ 
			EmployeeWageStores employee = new EmployeeWageStores(); 
			employee.addCompanyEmpWage("DMart",20,22,100); 
			employee.addCompanyEmpWage("Sephora",40,26,200); 
			employee.computeEmpwage(); 
			//System.out.println("Daily wages:"); 
			//employee.printDailyWage(); 


		} 


}

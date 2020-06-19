import java.util.ArrayList;
import java.util.List;

public class CampanyEmpWageArrarList implements CompanyWageImpl {
	 
	 	public static final int Part_Time = 1; 
	 	public static final int Full_Time = 2; 
	 
	 
	 	List<CompanyEmpwageUsingArrayList> companyEmpwageArray = new ArrayList<CompanyEmpwageUsingArrayList> (); 
	 
	 
	 	public void addCompanyEmpWage(String company_name,int emp_rate_per_hour,int working_days,int max_hours_per_month){ 
	 		CompanyEmpWage emp = new CompanyEmpWage(company_name , emp_rate_per_hour , working_days , max_hours_per_month); 
	 		companyEmpwageArray.add(emp); 
	 	} 
	 	public void computeEmpwage(){ 
	 		for(int i = 0; i < companyEmpwageArray.size(); i++){ 
	 			companyEmpwageArray.get(i).setTotalEmpwage(this.computeEmpwage(companyEmpwageArray.get(i))); 
	 			System.out.println(companyEmpwageArray.get(i)); 
	 		} 
	 	} 
	 	public int computeEmpwage(CompanyEmpwageUsingArrayList companyEmpwageUsingArrayList){ 
	 		int hrs=0 , totalhrs=0, totalworkingdays=0; 
	 		while(totalhrs <= companyEmpwageUsingArrayList.max_hours_per_month && totalworkingdays < companyEmpwageUsingArrayList.working_days){ 
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
	 			System.out.println("Day :" + totalworkingdays + " " + "Emphrs :" + hrs ); 
	 		} 
	 		return totalhrs * companyEmpwageUsingArrayList.emp_rate_per_hour; 
	 	} 
			public static void main(String[] args){ 
			EmpWageArray empwagrbuilder = new EmpWageArray(); 
			empwagrbuilder.addCompanyEmpWage("SnapDeal",20,22,100); 
			empwagrbuilder.addCompanyEmpWage("flipkart",40,26,200); 
			empwagrbuilder.computeEmpwage(); 

	 
	 	} 
	 
	 
	 
	  

		}




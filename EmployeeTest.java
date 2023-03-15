public class EmployeeTest{
public static void main (String[] args){
			Employee emp1=new Employee("john","Doe",5000);
			Employee emp2=new Employee("jone","Doe",6000);
		

           System.out.println("Employee 1 Yearly Salary:" +emp1.getYearlySalary());
		   System.out.println("Employee 2 Yearly Salary:" +emp2.getYearlySalary());
		   
		   emp1.raiseSalary(10);
		   emp2.raiseSalary(10);
		   
		   System.out.println("Employee 1 Yearly Salary(raise):" +emp1.getYearlySalary());
		   System.out.println("Employee 2 Yearly Salary(raise):" +emp2.getYearlySalary());   
		   
			
			
			
			}
		
		
		
		
		
}
public class CompanyEmpWage {

public final String company;
public final int empRateperHour;
public final int numOfWorkingDays;
public final int maxHoursPerMonth;
public int totalEmpWage;

public CompanyEmpWage (String company, int empRatePerhour,
		       int numOfWorkingDays, int maxHoursPerMonth) {
	this.company=company;
	this.empRatePerHour=empRatePerHour;
	this.numOfWorkingDays=numOfWorkingDays;
	this.maxHoursPermonth=maxHoursPerMonth;
}

public void setTotalEmpWage(int totalEmpWage) {
	this.totalEmpWage=totalEmpWage;
}

@Override
public String toString() {
	return "Total Emp Wage for Company: " +company+" is: "+
		totalEmpWage;
	}
}

public class EmpWageBuilderArray {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderArray() {
		companyEmpWageArray = new CompanyEmpWage[5];
}

private void addCompanyEmpWage(String company, int empRatePerHour,
			       int numOfWorkingDays, int maxHoursPerMonth) {
	companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,
                   empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
numOfCompany++;
}

private void computeEmpWage() {
	for (int i=0; i< numOfCompany; i++) {
companyempWageArray[i].setTotalEmpWage(this.computeEmpWage(
                                       companyEmpWageArray[i]));
	}
}

private void computeEmpWage(CompanyEmpwage companyEmpWage) {
	//Variables
	int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
	//Computation
	while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth &&
	       totalWorkingDays < companyEmpWage.numOfWorkingDays) {
	totalWorkingDays++;
	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	switch (empCheck) {
	  case IS_PART_TIME:
	     empHrs = 4;
	      break;
	case IS_FULL_TIME:
	    empHrs=8;
	     break;
	default:
	    empHrs=0;
	}
	totalEmpHrs += empHrs;
	System.out.println("Day#: " + totalWorkingDays + "Emp Hr: "
							  +empHrs);
	}
	return totalEmpHrs * companyEmpWage.empRatePerHour;
	}
	public static void main(String[] args) {
	   EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
	   empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
	   empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
	   empWageBuilder.computEmpWage();
}

public interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int empRatePerHour,
        int numOfWorkingDays, int maxHoursPerMonth);
public void computeEmpWage();
public void getTotalWage(String company);
}

public class CompanyEmpWage {

	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	pubic int totalEmpWage;
	
	public CompanyEmpWage(String company, int empRatePerHour,
			      int numOfWorkingDays, int maxHoursPerMonth) {
	this.company = company;
	this.empRatePerHour = empRatePerHour;
	this.numOfWorkingdays = numOfWorkingDays;
	this.maxHoursPerMonth = maxHoursPerMonth;
	totalEmpWage = 0;
	}
	
	public void setTotalEmpwage(int totalEmpWage) {
	    this.totalEmpWage = totalEmpwage;
	}

	public void setTotalEmpwage(int totalEmpWage) {
	    this.totalEmpWage = totalEmpwage;
	}

	@Override
	public String toString() {
	    return "Total Emp Wage for Company: " +comapny+" is: "+
		totalEmpWage;
	}
}

public class EmpWageBuilder implements IComputeEmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,ComapnyEmpWage> companyToEmpWageMap;

	public EmpWageBuilder() {
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new MashMap<>();
	}

public void addCompanyEmpWage(String company, int empRatePerHour,
                      int numOfWorkingDays, int maxHpursPerMonth) {
	CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,
	         empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
	companyEmpwageList.add(companyEmpWage);
	companyToEmpWageMap.put(company, companyEmpWage);
}

public void computeEmpWage() { for (int i=0; 
	i<companyEmpWageList.size();i++) { CompanyEmpWage companyEmpWage 
	= companyEmpWageList.get(i); 
	companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
	}
}

@Override
public int getTotalWage(String company) {
	return companyToEmpWageMap.get(company).totalEmpWage;
}

public int computeEmpWage(CompanyEmpWage companyEmpWage) { }

public static void main(String[] args) {
	IComputeEmpWage empWageBuilder = new EmpWageBuilder();
	empWageBuilder.addCompanyEmpWage(company "DMart", empRatePerHour 20,
	                           numOfWorkingDays 2, maxHoursPerMonth 10);
	empWageBuilder.addCompanyEmpWage(company "Reliance",
	empRatePerHour 10, numOfWorkingDays 4, maxHopursPerMonth 20);
	empWageBuilder.computeEmpWage();
	}
}


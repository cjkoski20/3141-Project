//package core.entities;

/**
 * Created by Cody Koski on 10/16/17.
 * This class will keep track of the information for each money
 */
public class Month extends Payment {
	
	public String month_name; // Represents the name of the month for the payments
	public Payment payment;
	
	/**
	 * Default constructor
	 */
	Month () {
		
	}
	
	/**
	 * @param m - Sets the name of the month
	 * @param p - Sets the month's payment to include income, savings, and expenses
	 * 
	 * Creates the month in order to set up the payment
	 */
	Month (String m, Payment p) {
		month_name = m;
		payment = p;
	}
	
	public void setMonthName(String m) {
		month_name = m;
	}
	
	public String getMonthName() {
		return month_name;
	}
	
	public void setIncome(double ms, double mo) {
		super.setMonthlySalary(ms);
		super.setMonthlyOther(mo);
	}
	
	public void setSavings(double ef, double i, double r) {
		super.setEmergencyFund(ef);
		super.setInvestments(i);
		super.setRetirement(r);
	}
	
	public void setExpenses(double t, double ins, double cp, double tax, double h,
			double f, double pc, double e, double at, double bu) {
		super.setTuition(t);
		super.setInsurance(ins);
		super.setCarPayment(cp);
		super.setTaxes(tax);
		super.setHousing(h);
		super.setFoodAndGroceries(f);
		super.setPersonalCare(pc);
		super.setEntertainment(e);
		super.setAutoAndTransport(at);
		super.setBillsAndUtilities(bu);
	}
}
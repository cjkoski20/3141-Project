//package core.entities;

/**
 * Created by Cody Koski on 10/16/17.
 * Date Last Modified: 10/30/17
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
	
	/**
	 * Sets the name of the inputed month
	 * @param m - inputed String representing the month name
	 */
	public void setMonthName(String m) {
		month_name = m;
	}
	
	/**
	 * @return Returns the name of current month
	 */
	public String getMonthName() {
		return month_name;
	}
	
	/**
	 * Sets the monthly income based on inputed double values
	 * @param ms - represents the monthly salary inputed by the user
	 * @param mo - represents the monthly other income
	 */
	public void setIncome(double ms, double mo) {
		super.setMonthlySalary(ms);
		super.setMonthlyOther(mo);
	}
	
	/**
	 * Sets the monthly savings based on inputed double values
	 * @param ef - represents the emergency fund savings
	 * @param i - represents the investment savings
	 * @param r - represents monthly retirement savings
	 */
	public void setSavings(double ef, double i, double r) {
		super.setEmergencyFund(ef);
		super.setInvestments(i);
		super.setRetirement(r);
	}
	
	/**
	 * Sets the monthly or annual expenses the user typically has
	 * @param t - represents annual tuition expenses
	 * @param ins - represents annual insurance expenses
	 * @param cp - represents annual car payment expenses
	 * @param tax - represents annual tax expenses
	 * @param h - represents the monthly housing expenses
	 * @param f - represents the monthly food and grocery expenses
	 * @param pc - represents the monthly personal care expenses
	 * @param e - represents the monthly entertainment expenses
	 * @param at - represents the monthly auto and transportation expenses
	 * @param bu - represents the bills and utilities expenses
	 */
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
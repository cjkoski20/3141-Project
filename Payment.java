import java.math.BigDecimal;
import java.math.RoundingMode;

//package core.entities;

/**
 * Created by Ryan Philipps on 10/13/17.
 * Date Last Modified: 10/16/17 by Cody Koski
 * The class representation of a 'bill', or 'payment' within the system
 */
public class Payment {
    // TODO Cody you can start designing this class of other entities

	/* Income */
	double monthly_salary = 0.0; // The monthly salary inputed by the user
	double monthly_other = 0.0; // Any other monthly income the user may have i.e child support
	/* Savings */
	double emergency_fund = 0.0; // Potential emergency funds the user might want to save
	double investments = 0.0; // Investments the user may have
	double retirement = 0.0; // Potential savings for retirement for the user
	/* Annual Expenses */
	double tuition = 0.0; // Annual bill for tuition for schooling
	double insurance = 0.0; // Annual bill for homeowner's or renters insurance
	double car_payment = 0.0; // Annual bill for car including registration, inspection, insurance, etc
	double taxes = 0.0; // Annual bill for taxes
	/* Monthly Expenses */
	double housing = 0.0; // This can include rent or monthly mortgage payments
	double foodAndGroceries = 0.0; // Monthly food bill
	double personal_care = 0.0; // Monthly expenses for personal care including haircuts, buying health/beauty products, etc
	double entertainment = 0.0; // Monthly expenses for entertainment such as movies, eating out, etc
	double autoAndTransport = 0.0; // Expenses for items such as gas for the user's car or other transportation
	double billsAndUtilities = 0.0; // Any other bills or utilities in the user's house
	
	double totalIncome = 0.0; // represents the total monthly income
	
	/**
	 * Default constructor
	 **/
	Payment () {
		
	}
	
	/**
	 * @param ms - sets the monthly salary
	 * @param mo - sets the monthly other income
	 * @param ef - sets the emergency funds savings
	 * @param i - sets the savings for investments
	 * @param r - sets the savings for retirement
	 * @param t - sets the annual tuition expenses
	 * @param ins - sets the annual insurance expenses
	 * @param cp - sets the annual car payment expenses
	 * @param tax - sets the annual tax expenses
 	 * @param h - sets the monthly housing expenses
	 * @param f - sets the monthly food and grocery expenses
	 * @param pc - sets the monthly personal care expenses
	 * @param e - sets the monthly entertainment expenses
	 * @param at - sets the auto and transportation expenses
	 * @param bu - sets the extra bills and utilities expenses
	 * 
	 * Creates a new payment, setting all payment categories including income, savings, and expenses
	 */
	Payment (double ms, double mo, double ef, double i, double r, double t, double ins, double cp, double tax, double h,
			double f, double pc, double e, double at, double bu) {
		monthly_salary = ms;
		monthly_other = mo;
		emergency_fund = ef;
		investments = i;
		retirement = r;
		tuition = t;
		insurance = ins;
		car_payment = cp;
		taxes = tax;
		housing = h;
		foodAndGroceries = f;
		personal_care = pc;
		entertainment = e;
		autoAndTransport = at;
		billsAndUtilities = bu;
		
		totalIncome = monthly_salary + monthly_other;
	}
	
	/**
	 * @return Returns the total income including salary and other forms of income as a double value
	 */
	public double getTotalIncome() {
		totalIncome = monthly_salary + monthly_other;
		
		return totalIncome;
	}
	
	/**
	 * @return Returns the current money left in account by subtracting total expenses from the total income as a double value
	 */
	public double getBankAccountStatus() {
		double monthlyExpenses = emergency_fund + investments + retirement + (tuition / 12.0) + (insurance / 12.0) +
		(car_payment / 12.0) + (taxes / 12.0) + housing + foodAndGroceries + personal_care + entertainment +
		autoAndTransport + billsAndUtilities;
		
		return totalIncome - monthlyExpenses;
	}
	
	/**
	 * @return Returns the user's total monthly expenses as a double value
	 */
	public double getTotalExpenses() {
		return emergency_fund + investments + retirement + (tuition / 12.0) + (insurance / 12.0) +
				(car_payment / 12.0) + (taxes / 12.0) + housing + foodAndGroceries + personal_care + entertainment +
				autoAndTransport + billsAndUtilities;
	}
	
	/**
	 * @return Returns the user's monthly salary
	 */
	public double getMonthlySalary() {
		return monthly_salary;
	}
	
	public void setMonthlySalary(double ms) {
		monthly_salary = ms;
	}
	
	/**
	 * @return Returns any other monthly income the user may have
	 */
	public double getMonthlyOther() {
		return monthly_other;
	}
	
	public void setMonthlyOther(double mo) {
		monthly_other = mo;
	}
	
	/**
	 * @return Returns the user's potential emergency fund balance
	 */
	public double getEmergencyFund() {
		return emergency_fund;
	}
	
	public void setEmergencyFund(double ef) {
		emergency_fund = ef;
	}
	
	public double getEmergencyFundPercentage() {
		return new BigDecimal((emergency_fund / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
	
	/**
	 * @return Returns the user's investment balance
	 */
	public double getInvestments() {
		return investments;
	}
	
	public void setInvestments(double i) {
		investments = i;
	}
	
	public double getInvestmentsPercentage() {
		return new BigDecimal((investments / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
	
	/**
	 * @return Returns the user's retirement fund balance
	 */
	public double getRetirement() {
		return retirement;
	}
	
	public void setRetirement(double r) {
		retirement = r;
	}
	
	public double getRetirementPercentage() {
		return new BigDecimal((retirement / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
	
	/**
	 * @return Returns the user's annual tuition bill
	 */
	public double getTuition() {
		return tuition;
	}
	
	public void setTuition(double t) {
		tuition = t;
	}
	
	/**
	 * @return Returns the user's monthly tuition expenses
	 */
	public double getMonthlyTuition() {
		return tuition / 12.0;
	}
	
	public double getMonthlyTuitionPercentage() {
		return new BigDecimal(((tuition / 12.0) / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
	
	/**
	 * @return Returns the user's annual insurance bill
	 */
	public double getInsurance() {
		return insurance;
	}
	
	public void setInsurance(double ins) {
		insurance = ins;
	}
	
	/**
	 * @return Returns the user's monthly insurance expenses
	 */
	public double getMonthlyInsurance() {
		return insurance / 12.0;
	}
	
	public double getMonthlyInsurancePercentage() {
		return new BigDecimal(((insurance / 12.0) / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
	
	/**
	 * @return Returns the user's annual car payment bill
	 */
	public double getCarPayment() {
		return car_payment;
	}
	
	public void setCarPayment(double cp) {
		car_payment = cp;
	}
	
	/**
	 * @return Returns the user's monthly car payment expenses
	 */
	public double getMonthlyCarPayment() {
		return car_payment / 12.0;
	}
	
	public double getMonthlyCarPaymentPercentage() {
		return new BigDecimal(((car_payment / 12.0) / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
	
	/**
	 * @return Returns the user's annual tax bill
	 */
	public double getTaxes() {
		return taxes;
	}
	
	public void setTaxes(double tax) {
		taxes = tax;
	}
	
	/**
	 * @return Returns the user's monthly tax expenses
	 */
	public double getMonthlyTaxes() {
		return taxes / 12.0;
	}
	
	public double getMonthlyTaxPercentage() {
		return new BigDecimal(((taxes / 12.0) / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
	
	/**
	 * @return Returns the user's monthly housing expenses
	 */
	public double getHousing() {
		return housing;
	}
	
	public void setHousing(double h) {
		housing = h;
	}
	
	public double getHousingPercentage() {
		return new BigDecimal((housing / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
	
	/**
	 * @return Returns the user's monthly food and grocery expenses
	 */
	public double getFoodAndGroceries() {
		return foodAndGroceries;
	}
	
	public void setFoodAndGroceries(double f) {
		foodAndGroceries = f;
	}
	
	public double getFoodAndGroceriesPercentage() {
		return new BigDecimal((foodAndGroceries / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
	
	/**
	 * @return Returns the user's monthly personal care expenses
	 */
	public double getPersonalCare() {
		return personal_care;
	}
	
	public void setPersonalCare(double pc) {
		personal_care = pc;
	}
	
	public double getPersonalCarePercentage() {
		return new BigDecimal((personal_care / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
	
	/**
	 * @return Returns the user's monthly entertainment expenses
	 */
	public double getEntertainment() {
		return entertainment;
	}
	
	public void setEntertainment(double e) {
		entertainment = e;
	}
	
	public double getEntertainmentPercentage() {
		return new BigDecimal((entertainment / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
	
	/**
	 * @return Returns the user's monthly auto and transportation expenses
	 */
	public double getAutoAndTransport() {
		return autoAndTransport;
	}
	
	public void setAutoAndTransport(double at) {
		autoAndTransport = at;
	}
	
	public double getAutoAndTransportPercentage() {
		return new BigDecimal((autoAndTransport / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
	
	/**
	 * @return Returns the user's monthly utility expenses
	 */
	public double getBillsAndUtilities() {
		return billsAndUtilities;
	}
	
	public void setBillsAndUtilities(double bu) {
		billsAndUtilities = bu;
	}
	
	public double getBillsAndUtilitiesPercentage() {
		return new BigDecimal((billsAndUtilities / getTotalExpenses()) * 100).setScale(2, RoundingMode.DOWN).doubleValue();
	}
}

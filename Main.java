import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Month> months = new ArrayList<Month>();
		Month month = new Month();
		month.setMonthName("October");
		month.setIncome(4000, 200);
		month.setSavings(150, 0, 50);
		month.setExpenses(2400, 600, 1200, 1200, 450, 200, 100, 200, 250, 150);
		months.add(0, month);
		
		System.out.println(months.get(0).getTotalIncome());
		System.out.println(months.get(0).getTotalExpenses());
		System.out.println(months.get(0).getBankAccountStatus());
		
		System.out.println("_____________________________");
		System.out.println("EMERGENCY FUND :: " + months.get(0).getEmergencyFundPercentage() + "%");
		System.out.println("INVESTMENTS :: " + months.get(0).getInvestmentsPercentage() + "%");
		System.out.println("RETIREMENT :: " + months.get(0).getRetirementPercentage() + "%");
		System.out.println("_____________________________");
		System.out.println("TUITION :: " + months.get(0).getMonthlyTuitionPercentage() + "%");
		System.out.println("INSURANCE :: " + months.get(0).getMonthlyInsurancePercentage() + "%");
		System.out.println("CAR PAYMENT :: " + months.get(0).getMonthlyCarPaymentPercentage() + "%");
		System.out.println("TAXES :: " + months.get(0).getMonthlyTaxPercentage() + "%");
		System.out.println("_____________________________");
		System.out.println("HOUSING :: " + months.get(0).getHousingPercentage() + "%");
		System.out.println("FOOD AND GROCERIES :: " + months.get(0).getFoodAndGroceriesPercentage() + "%");
		System.out.println("PERSONAL CARE :: " + months.get(0).getPersonalCarePercentage() + "%");
		System.out.println("ENTERTAINMENT :: " + months.get(0).getEntertainmentPercentage() + "%");
		System.out.println("AUTO AND TRANSPORT :: " + months.get(0).getAutoAndTransportPercentage() + "%");
		System.out.println("BILLS AND UTILITIES :: " + months.get(0).getBillsAndUtilitiesPercentage() + "%");
	}

}
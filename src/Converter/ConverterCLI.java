package Converter;
import java.util.Scanner;

import Menu.Menu;

public class ConverterCLI {
	private static final String MAIN_MENU_CONVERT_METRICS = "Unit Converter";
	private static final String MAIN_MENU_CONVERT_CURRENCIES = "Currency Converter";
	private static final String MAIN_MENU_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_CONVERT_METRICS, MAIN_MENU_CONVERT_CURRENCIES, 
			MAIN_MENU_EXIT};
	
	private static final String CONVERT_UNITS = "Convert Units";
	private static final String CALCULATOR = "Calculator";
	private static final String GO_BACK = "Return to Previous Menu";
	private static final String [] UNIT_CONVERSION_MENU = {CONVERT_UNITS, CALCULATOR, GO_BACK};
	
	private static final String CURRENCY_USD_CNY = "USD - CNY";
	private static final String CURRENCY_USD_JPY = "USD - JPY"; 
	private static final String CURRENCY_CALCULATOR = "Calculator";
	private static final String[] CURRENCY_MENU_OPTIONS = {CURRENCY_USD_CNY, CURRENCY_USD_JPY, CURRENCY_CALCULATOR, GO_BACK};
	
	private Menu menu;
	boolean isMain = true;
	
	public ConverterCLI(Menu menu) {
		this.menu = menu;
	}
	
	private void run() {
		while(isMain) {
			String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			if(MAIN_MENU_CONVERT_METRICS.equals(choice)) {
				String converterMenuChoice = (String)menu.getChoiceFromOptions(UNIT_CONVERSION_MENU);
				
				if (CONVERT_UNITS.equals(converterMenuChoice)) {
					unitConvert();
					
				} else if (CALCULATOR.equals(converterMenuChoice)) {
					//calc
				} else if (MAIN_MENU_EXIT.equals(converterMenuChoice)) {
					isMain = false;
				}	
			} else if(MAIN_MENU_CONVERT_CURRENCIES.equals(choice)) {
				//currency go here
				String currencyChoice = (String)menu.getChoiceFromOptions(CURRENCY_MENU_OPTIONS);
				if (CURRENCY_USD_CNY.equals(currencyChoice)) {
					//unit conversion method goes here
				} else if (CURRENCY_USD_JPY.equals(currencyChoice)) {
					
				} else if (CALCULATOR.equals(currencyChoice)) {
					//calc
				} else if (MAIN_MENU_EXIT.equals(currencyChoice)) {
					isMain = false;
					
				}
						
					
			} else if(MAIN_MENU_EXIT.equals(choice)) {
				
				System.out.println("Bye, but I know you'll be back soon kek");
				System.exit(3);
				
			}
		}
	}
	
	public void unitConvert() {
		//unit conversion method goes here
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Convert from: cm, in, kg, lb)");
		String fromUnit = userInput.nextLine(); 
		System.out.print("Value: ");
		double value = userInput.nextDouble();
		
		Metrics converter = new Metrics(fromUnit);
		
		double convertedValue = converter.toUnit(value);
	
		System.out.print(convertedValue);
		
	}
	
	

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		ConverterCLI cli = new ConverterCLI(menu);
		cli.run();
	}
	
	
	
}

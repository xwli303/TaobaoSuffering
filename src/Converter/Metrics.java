package Converter;

public class Metrics {
	
	final private double INCH_TO_CENTIMETER = 2.54;
	final private double CENTIMETER_TO_INCH = 0.393701;
	final private double KG_TO_LB = 2.20462;
	final private double LB_TO_KG = 0.453592;
	private double factor;
	
	public Metrics(String unit) {
		if (unit.equalsIgnoreCase("in")) {
			factor = INCH_TO_CENTIMETER;
		} else if (unit.equalsIgnoreCase("cm")){
			factor = CENTIMETER_TO_INCH;
		} else if (unit.equalsIgnoreCase("kg")) {
			factor = KG_TO_LB;
		} else if (unit.equalsIgnoreCase("lb")) {
			factor = LB_TO_KG;
		}
		
	}
	
	
	
	public double toUnit(double measurement) {
		return (measurement * factor);
	}
	
//	public double toInch(double measurement) {
//		return (measurement * factor);
//	}
//	
//	public double toKg(double measurement) {
//		return (measurement * factor);
//	}
//	
//	public double toLb(double measurement) {
//		return (measurement * factor);
//	}

}

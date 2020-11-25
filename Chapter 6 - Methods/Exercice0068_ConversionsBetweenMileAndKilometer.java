package Chapter_6_Methods;

public class Exercice0068_ConversionsBetweenMileAndKilometer {

	public static void main(String[] args) {
		/*
		 * (Conversions between mile and kilometer) Write a class that contains the
		 * following two methods:
		 * 
		 * //Convert from Mile to Kilometer
		 *  public static double mileToKilometer(double mile)
		 *  
		 * //Convert from Kilometer to Mile 
		 * public static double kilometerToMile(double kilometer) 
		 * 
		 * The formula for the conversion is: 1 mile = 1.6 kilometers Write a
		 * test program that invokes these methods to display the following tables:
		 * 
			Miles          Kilometers     |    Kilometers     Miles          
			--------------------------------------------------------
			1                1.600        |        20       	2.500
			2                3.200        |        25       	15.625
			...
			9                14.400       |        60      		37.500
			10               16.000       |        65         40.625
		 *
		 * Bryan Chontasi 24/11/2020
		 */
		
		//create table
		System.out.printf("%-15s%-15s%-5s%-15s%-15s\n","Miles", "Kilometers","|","Kilometers","Miles");
		System.out.println("--------------------------------------------------------");
		
		//loop for print kilometres and miles in the table
		for(int i = 1; i <= 10; i++)
		System.out.printf("%-17d%-9.3f%5s%10d%15.3f\n", i, mileToKilometer(i),"|", 15 + 5 * i, kilometerToMile(15+5*i));
		
	}
	//method to convert miles to kilometres
	public static double mileToKilometer(double mile) {
		return mile *1.6;
	}
	//method to convert kilometres into miles
	public static double kilometerToMile(double kilometer) {
        return kilometer / 1.6;
	}
}

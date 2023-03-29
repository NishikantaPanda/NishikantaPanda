package com.vtiger.genericUtilities;

	import java.util.Date;
	import java.util.Random;

	/**
	 * This class conatins all the generic methods related To Java
	 * @author Nishikant P
	 *
	 */
	public class JavaUtility {
		
		/**
		 * This method will provide the system date
		 * @return Current Date
		 */
		public String getSystemDate() 
		{ 
			Date d = new Date();
			return d.toString();
						
		}

		/**
		 * This method will provide the system date in specific format
		 * @return Current Date in a specified format
		 */
		public String getSystemDateAndTimeInSpecificFormat()
		{

			Date d = new Date();
			String date[]=d.toString().split(" ");
			String dayName= date[0];
			String month= date[1];
			String actualDate=date[2];
			String time=date[3].replace(":", "-");
			String year= date[5];
			
			String finalDate= actualDate+" "+month+" "+year+" "+ time+" "+dayName+"day";
			return finalDate;
			
		}
		
		/**
		 * This method will return a random number for every run
		 * @return Random Number
		 */
		public int getRandomNumber() 
		{
			Random r = new Random();
			return r.nextInt(1000);
			
		}
		
		
	}


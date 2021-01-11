/**
 * Create a method to accept date and print the duration in days,
 *  months and years with regards to current system date
 * @author Rupsi
 */
package com.capg.lab_3.util;
import java.util.*;
import java.time.*;
public class Duration {

	public static void main(String[] args) {
		LocalDate current_date=LocalDate.now();
		
		LocalDate end_date=LocalDate.of(2022, 12, 29);
		getDuration(current_date,end_date);
		
	}
   static void getDuration(LocalDate current_date, LocalDate end_date)
    {
    	Period duration=Period.between(current_date,end_date);
    	System.out.printf( 
                "%d years, %d months"
                    + " and %d days ", 
                duration.getYears(), 
                duration.getMonths(), 
                duration.getDays());
    }
}

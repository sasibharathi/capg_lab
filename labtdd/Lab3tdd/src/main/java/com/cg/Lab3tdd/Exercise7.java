/**
 * 
 * Create a method to accept date and print the duration in days, months and years with regards to current system date.
 * @Author SASI
 */

package com.cg.Lab3tdd;
import java.time.LocalDate;
import java.time.Period;
public class Exercise7 {
	public static void main(String[] args)
    {
        LocalDate pastDate = LocalDate.of(1999,05, 02);
        LocalDate presentDate = LocalDate.now();
 
        Period diff = Period.between(pastDate, presentDate);
 
     System.out.printf("Difference is", diff.getYears(), diff.getMonths(), diff.getDays());
  }

}

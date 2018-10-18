package birthCalculator;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class BirthCalculator {
	
	public static void main( String[] args ) {
		int day;
		int month;
		int year;
		int nowDay;
		int nowMonth;
		int nowYear;
		
		Scanner input = new Scanner( System.in );
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		
		nowMonth = now.getMonthValue();
		nowYear = now.getYear();
		nowDay =  now.getDayOfMonth();
		
		try {
			System.out.println("Please enter your day of birth: ");
			day = input.nextInt();
			System.out.println("Please enter your birth month: ");
			month = input.nextInt();
			System.out.println("Please enter your birth year: ");
			year = input.nextInt();
			
			if (day < 0 || month < 0 || year < 00) {
				 throw new NegativeEntryException();
			}
			else if (day > 31) {
				throw new InvalidDayEntryException();
			}
			else if (month > 12) {
				throw new InvalidMonthEntryException();
			}
			else if (year > nowYear) {
				throw new InvalidYearEntryException();
			}
			else {
				year = (nowYear - year);
				if (month > nowMonth) {
					year = year -1;
					month = month - nowMonth;
				}
				else if (month < nowMonth) {
					month = nowMonth + (12 - month);
				}
				System.out.println("You lived: " + year + " years, " + month + " months, " + nowDay + " days");
			}
		}
		catch (NegativeEntryException e){
			System.out.println("You wrote a negative number");   
		}
		catch (InvalidDayEntryException e) {
			System.out.println("You put a bigger valid day number");  
		}
		catch (InvalidMonthEntryException e) {
			System.out.println("You put a bigger valid month number");  
		}
		catch (InvalidYearEntryException e) {
			System.out.println("You put a bigger valid year number");  
		}
	}
}

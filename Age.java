import java.time.LocalDate;
import java.time.Period;

public class Age {
	public static void main(String args[]) {
		LocalDate now = LocalDate.now();
		LocalDate bday = LocalDate.of(1999,5,13);
		
		Period timeSpan = Period.between(bday, now);
		System.out.println("How many years have passed? "+timeSpan.getYears());
		System.out.println("How many months have passed? "+timeSpan.getMonths());
		System.out.println("How many days have passed? "+timeSpan.getDays());
		System.out.println("How many total months have passed? "+timeSpan.toTotalMonths());
			
	}
}

package ubu.gii.dass.refactoring;

public class Children extends Price{

	
	public double getCharge(Rental rental) {
        double amount = 1.5;
        if (rental.getDaysRented() > 3)
            amount += (rental.getDaysRented() - 3) * 1.5;
        return amount;
    }
	
}
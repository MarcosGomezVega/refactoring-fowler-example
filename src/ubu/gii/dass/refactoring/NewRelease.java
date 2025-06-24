package ubu.gii.dass.refactoring;


public class NewRelease extends Price {

	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	public int getFrecuentRenterPoints(Rental rental) {
        if (rental.getDaysRented() > 1) return 2;
        return 1;
    }
	
	double getCharge(Rental rental){
		return rental.getDaysRented() * 3;
	}
}
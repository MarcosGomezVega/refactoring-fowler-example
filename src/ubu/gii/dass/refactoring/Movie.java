package ubu.gii.dass.refactoring;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicación de refactorizaciones. Actualizado para colecciones
 * genéricas de java 1.5.
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos López</A>
 * @version 1.1
 * @see java.io.File
 * 
 */

public class Movie {
	private String _title;
	Price _price;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	
	public void setPriceCode(int arg) {
		switch(arg) {
			case Price.REGULAR:
				_price = new Regular();
				break;
			case Price.NEW_RELEASE:
				_price = new NewRelease();
				break;
			case Price.CHILDRENS:
				_price = new Children();
				break;
			default:
				throw new IllegalArgumentException("Código de precio incorrecto");
		}
	}
	
	public String getTitle() {
		return _title;
	}
}

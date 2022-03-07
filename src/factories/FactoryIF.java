package factories;

import enums.ProductTypes;
import model.Book;
import model.ProductIF;

public interface FactoryIF {
	
	ProductIF createProduct(ProductTypes type, String name, String code, Double price);
}

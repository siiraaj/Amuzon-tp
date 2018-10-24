package fr.amu.models;

import java.util.List;

import fr.amu.beans.Product;

public interface ProductDAO {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	List<Product> findAll();
	Product findById( Integer id );
	List<Product> findByCategory( String category );
}


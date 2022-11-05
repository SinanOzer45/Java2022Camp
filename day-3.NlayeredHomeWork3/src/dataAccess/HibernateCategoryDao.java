package dataAccess;

import java.util.ArrayList;

import entities.Category;


public class HibernateCategoryDao implements CategoryDao {
	ArrayList<Category> categories = new ArrayList<Category>();
	

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile kategori veritabanına eklendi!");
		
	}

	@Override
	public boolean check(String categoryName) {
		for(Category category : categories) {
			if(category.getCategoryName().equalsIgnoreCase(categoryName)) {
				return true;
			}
		}
		
		return false;
	}
}


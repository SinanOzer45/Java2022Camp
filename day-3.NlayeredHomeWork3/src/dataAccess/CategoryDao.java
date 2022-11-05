package dataAccess;

import entities.Category;

public interface CategoryDao {
	void add(Category category);
	boolean check(String categoryName);
}

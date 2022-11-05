package dataAccess;

import entities.Course;

public interface CourseDao {
	
	void add(Course course);
	 boolean check(String title);

}


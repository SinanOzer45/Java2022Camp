

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.Logger;
import logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger loggers[] = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		Category category01 = new Category(1,"Tümü");
		Category category02 = new Category(2,"Programlama");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.add(category01);
		categoryManager.add(category02);
		
		Course course01 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)","Ücretsiz ve profesyonel bir programla,Sıfırdan yazılım geliştirme öğreniyoruz.","Engin Demiroğ",149,"2 Ay","Junior");
		Course course02 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","Ücretsiz ve profesyonel bir programla,Sıfırdan yazılım geliştirme öğreniyoruz.","Engin Demiroğ",159,"2 Ay","Junior");
		Course course03 = new Course(3,"Yazılım Geliştirici Yetiştirme Kampı (Javascript)","Ücretsiz ve profesyonel bir programla,Sıfırdan yazılım geliştirme öğreniyoruz.","Engin Demiroğ",169,"1.5 Ay","Junior");
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course01);
		courseManager.add(course02);
		courseManager.add(course03);
		
		
		Instructor instructor01 = new Instructor(1, "Engin", "Demiroğ");
		

		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor01);
			
		}
	}

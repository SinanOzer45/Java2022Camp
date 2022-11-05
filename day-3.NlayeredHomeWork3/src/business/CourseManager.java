package business;


import dataAccess.CourseDao;
import entities.Course;
import logging.Logger;


public class CourseManager {
		private CourseDao courseDao;
		private Logger[] loggers;
		
		public CourseManager(CourseDao courseDao, Logger[] loggers) {
			
			this.courseDao = courseDao;
			this.loggers = loggers;
		}
		
		public void add(Course course) throws Exception{
			if (courseDao.check(course.getCourseTitle())) {
				throw new Exception("Course name has already been exist!");
			}
			if(course.getCoursePrice()<0) {
				throw new Exception("Course price can not be fewer than 0");
			}
			courseDao.add(course);
			for(Logger logger : loggers) {
				logger.log(course.getCourseTitle());
			}
		}
		
	}


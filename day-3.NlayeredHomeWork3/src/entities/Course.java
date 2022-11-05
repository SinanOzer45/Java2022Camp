package entities;

public class Course {
	
	private int courseId;
	private String courseTitle;
	private String courseDescription;
	private String courseInstructor;
	private double coursePrice;
	private String courseDuration;
	private String courseDifficulty;
	
	public Course(int courseId, String courseTitle, String courseDescription, String courseInstructor,
			double coursePrice, String courseDuration, String courseDifficulty) {
		
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.courseDescription = courseDescription;
		this.courseInstructor = courseInstructor;
		this.coursePrice = coursePrice;
		this.courseDuration = courseDuration;
		this.courseDifficulty = courseDifficulty;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public String getCourseDifficulty() {
		return courseDifficulty;
	}

	public void setCourseDifficulty(String courseDifficulty) {
		this.courseDifficulty = courseDifficulty;
	}
}

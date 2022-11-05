package entities;

	public class Instructor {
		private int instructorId;
		private String firstName;
		private String lastNamme;
		
		public Instructor(int instructorId, String firstName, String lastNamme) {
			
			this.instructorId = instructorId;
			this.firstName = firstName;
			this.lastNamme = lastNamme;
		}

		public int getInstructorId() {
			return instructorId;
		}

		public void setInstructorId(int instructorId) {
			this.instructorId = instructorId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastNamme() {
			return lastNamme;
		}

		public void setLastNamme(String lastNamme) {
			this.lastNamme = lastNamme;
		}
}

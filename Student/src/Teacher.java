public class Teacher extends Person {
	private String subject;
	
	public Teacher (String name, String family, String subject) {
		super (name, family);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
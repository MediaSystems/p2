package debug;

import java.util.ArrayList;

public class Lecture {

	
	private String lectureName;
	private Professor lecturer;
	private Student tutor;
	
	private ArrayList<Student> students = new ArrayList<>();
	
	public Lecture(String lectureName, Professor professor, Student tutor) {
		this (lectureName, professor);
		this.tutor = tutor;
	}

	public Lecture(String lectureName, Professor professor) {
		this.lecturer = professor;
		this.lectureName = lectureName;
	}
	
	public void setTutor(Student tutor) {
		this.tutor = tutor;
	}
	
	public String getLectureName() {
		return lectureName;
	}
	
	public Professor getLecturer() {
		return lecturer;
	}
	
	public Student getTutor() {
		return tutor;
	}
		
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void addStudent (Student student) {
		if (!students.contains(student)) {
			students.add(student);
		}
	}
	
	@Override
	public String toString() {
		String str = lectureName + "(" + ((Person)lecturer).toString() + ")" +":\n\n";
		
		for (Student stud : students)
			str += stud + "\n";
		
		return str + "\n\n";
	}

}

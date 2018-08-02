package dao;

import dto.Student;

public interface IStudentDao {
	public int addNew(Student s);
	public Student display(int id);

}

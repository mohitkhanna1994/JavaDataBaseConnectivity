package service;

import dao.IStudentDao;
import dao.StudentDaoImpl;
import dto.Student;

public class StudentServiceImpl implements IStudentService {

	IStudentDao dao=new StudentDaoImpl();
	
	@Override
	public int addNew(Student s) {
		return dao.addNew(s);
	}

	@Override
	public Student display(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

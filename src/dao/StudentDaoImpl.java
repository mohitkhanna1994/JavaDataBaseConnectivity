package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import dto.Student;

public class StudentDaoImpl implements IStudentDao {
	DBConnection db=new DBConnection();

	@Override
	public int addNew(Student s) {
		Connection conn=db.getConnection();
		try {
			PreparedStatement stmt=conn.prepareStatement(QueryMapper.INSERT);
			stmt.setString(1, s.getName());
			stmt.setInt(2, s.getId());
			stmt.setDouble(3, s.getMarks());
			int a=stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL Exception");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Student display(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

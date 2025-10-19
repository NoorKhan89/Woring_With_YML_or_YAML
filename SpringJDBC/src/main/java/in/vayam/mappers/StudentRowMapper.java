package in.vayam.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.vayam.beans.Student;

public class StudentRowMapper implements RowMapper<Student>
{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st= new Student();
		st.setRollno(rs.getInt("rollno"));
		st.setName(rs.getString("name"));
		st.setCity(rs.getString("city"));
		return st;
	}

}

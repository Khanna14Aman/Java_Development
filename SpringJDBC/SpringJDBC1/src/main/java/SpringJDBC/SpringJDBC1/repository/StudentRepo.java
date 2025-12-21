package SpringJDBC.SpringJDBC1.repository;

import SpringJDBC.SpringJDBC1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Scope("prototype")
public class StudentRepo {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student){
        String sqlQuery = "insert into student (id,name,age) values(?,?,?)";
        int rowsAffected = jdbcTemplate.update(sqlQuery,student.getID(),student.getName(),student.getAge());
        System.out.println(rowsAffected+" number of rows affected");
    }

    public List<Student> findAll() {
        String sqlQuery = "select * from student";
        RowMapper<Student> mapper = new RowMapper<>()
        {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setID(rs.getInt("ID"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                return s;
            }
        };
        return jdbcTemplate.query(sqlQuery, mapper);
    }
}

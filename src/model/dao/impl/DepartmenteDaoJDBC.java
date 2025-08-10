package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.DepartamentDao;
import model.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class DepartmenteDaoJDBC implements DepartamentDao {
    Connection conn = DB.getConnection();
    public DepartmenteDaoJDBC (Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj1) {
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement(
              "insert into department "
                 +"(Id, Name) "
                 + "values (? , ?) ",
                PreparedStatement.RETURN_GENERATED_KEYS);

            st.setInt(1, obj1.getId());
            st.setString(2, obj1.getName());
            st.executeUpdate();
        }
        catch (Exception e){
            throw  new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Department obj1) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return List.of();
    }
}

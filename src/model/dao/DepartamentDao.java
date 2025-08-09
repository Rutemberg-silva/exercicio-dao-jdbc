package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartamentDao {
    void insert(Department obj1);
    void update(Department obj1);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}

package application;

import model.dao.DaoFactory;
import model.dao.DepartamentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        DepartamentDao departamentDao = DaoFactory.createDepartamentDao();
        System.out.println("Insercao de new department");
        Department department = new Department(10, "Floricultura");
        departamentDao.insert(department);
        System.out.println("Insercao de new department sucessfully");



    }
}

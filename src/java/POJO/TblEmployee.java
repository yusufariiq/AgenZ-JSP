package POJO;
// Generated Oct 14, 2022 9:20:41 AM by Hibernate Tools 4.3.1

import DAO.DAOEmployee;
import java.util.List;
import javax.faces.bean.ManagedBean;




/**
 * TblEmployee generated by hbm2java
 */
@ManagedBean
public class TblEmployee  implements java.io.Serializable {


     private Integer idEmployee;
     private String name;
     private String email;
     private String phone;
     private String department;
     private String address;
     private String search;
     private List<TblEmployee> employeeList;
    
    // Umtuk menampilkan data ke table
    public List<TblEmployee> getAllEmployee() {
        DAOEmployee emp = new DAOEmployee();
        return emp.showAll();
    } 
     
    // Untuk menambahkan data
    public String create() {
        DAOEmployee employee = new DAOEmployee();
        employee.addEmployee(this);
        return "viewEmployee";
    }
    
    // Untuk mengambil id employee
    public String getById(int empId) {
        DAOEmployee employee = new DAOEmployee();
        List<TblEmployee> listEmployee = employee.ShowByID(empId);

        try {
            idEmployee = listEmployee.get(0).idEmployee;
            name = listEmployee.get(0).name;
            email = listEmployee.get(0).email;
            phone = listEmployee.get(0).phone;
            department = listEmployee.get(0).department;
            address = listEmployee.get(0).address;
            return "editEmployee";
        } catch (Exception e) {
            System.out.println(e);
        }
        return "login_error";
    }
    
    // Untuk merubah data    
    public String update() {
        DAOEmployee employee = new DAOEmployee();
        employee.editEmployee(this);
        return "viewEmployee";
    }
    
    // Untuk menghapus data
    public void delete(int id) {
        DAOEmployee employee = new DAOEmployee();
        employee.deleteEmploye(id);
    }
    
    // Untuk mencari data
    public void search() {
        employeeList = search.length() > 0 ? new DAOEmployee().ShowByName(search) : this.getAllEmployee();
    }
    
    public TblEmployee() {
    }

    public TblEmployee(String name, String email, String phone, String department, String address) {
       this.name = name;
       this.email = email;
       this.phone = phone;
       this.department = department;
       this.address = address;
    }
   
    public Integer getIdEmployee() {
        return this.idEmployee;
    }
    
    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
    
    public List<TblEmployee> getEmployeeList() {
        return employeeList == null ? this.getAllEmployee(): employeeList;
    }

    public void setEmployeeList(List<TblEmployee> employeeList) {
        this.employeeList = employeeList;
    }


}



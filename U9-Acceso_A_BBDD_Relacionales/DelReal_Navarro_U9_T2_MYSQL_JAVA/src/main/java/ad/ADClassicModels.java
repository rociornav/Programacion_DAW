package ad;

import database.ConexionBD;
import model.Employee;
import model.Office;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {
    public List<Employee> getEmpleados() {

        String sql = "SELECT * FROM employees";
        List<Employee> listEmpleados = new ArrayList<Employee>();
        Employee emp = null;

        ConexionBD.getConnectionSingleton();

        try {
            PreparedStatement ps = ConexionBD.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int employeeNumber = rs.getInt(1);
                String lastName = rs.getString(2);
                String firstName = rs.getString(3);
                String extension = rs.getString(4);
                String email = rs.getString(5);
                String officeCode = rs.getString(6);
                int reportsTo = rs.getInt(7);
                String jobTitle = rs.getString(8);

                emp = new Employee(employeeNumber, lastName, firstName, extension, email, officeCode, reportsTo,
                        jobTitle);

                listEmpleados.add(emp);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return listEmpleados;

    }

    public List<Office> getOffices(){

        String sql = "SELECT * FROM offices";
        List<Office> listOffices = new ArrayList<Office>();
        Office offc = null;

        ConexionBD.getConnectionSingleton();

        try {
            PreparedStatement ps = ConexionBD.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String officeCode = rs.getString(1);
                String city = rs.getString(2);
                String phone = rs.getString(3);
                String addressLine1 = rs.getString(4);
                String addressLine2 = rs.getString(5);
                String state = rs.getString(6);
                String country = rs.getString(7);
                String postalCode = rs.getString(8);
                String territory = rs.getString(9);

                offc = new Office(officeCode,city,phone,addressLine1,addressLine2,state,country,postalCode,territory);

                listOffices.add(offc);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listOffices;

    }
}

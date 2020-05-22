package dao;

import db.ConexionBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author rocio
 */
public class CustomerDAO {
    private static int customerNumber = 500;

    public static void createCustomer(Scanner sc) {

        boolean check = false;
        sc.nextLine();
        System.out.println("Nombre:");
        String customerName = sc.nextLine();

        System.out.println("Apellido Contacto:");
        String contactLastName = sc.nextLine();

        System.out.println("Nombre Contacto:");
        String contactFirstName = sc.nextLine();

        System.out.println("Teléfono:");
        String phone = sc.nextLine();

        System.out.println("Dirección:");
        String addressLine1 = sc.nextLine();

        System.out.println("Dirección adicional:");
        String addressLine2 = sc.nextLine();

        System.out.println("Ciudad:");
        String city = sc.nextLine();

        System.out.println("Provincia:");
        String state = sc.nextLine();

        System.out.println("Código postal:");
        String postalCode = sc.nextLine();

        System.out.println("País:");
        String country = sc.nextLine();

        String sql = "INSERT INTO customers(customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimit) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        ConexionBD.getConnectionSingleton();

        try {

            PreparedStatement ps = ConexionBD.getCon().prepareStatement(sql);

            ps.setInt(1, customerNumber);
            ps.setString(2, customerName);
            ps.setString(3, contactLastName);
            ps.setString(4, contactFirstName);
            ps.setString(5, phone);
            ps.setString(6, addressLine1);
            ps.setString(7, addressLine2);
            ps.setString(8, city);
            ps.setString(9, state);
            ps.setString(10, postalCode);
            ps.setString(11, country);
            ps.setString(12, null);
            ps.setInt(13, 0);

            check = ps.executeUpdate() > 0;

            if (check) {
                customerNumber++;
                System.out.println("**********************************");
                System.out.println("Cliente añadido correctamente");
                System.out.println("**********************************");
            } else {
                System.out.println("**********************************");
                System.out.println("Error al insertar el cliente");
                System.out.println("**********************************");
            }

            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void assignEmployeeToCustomer(Scanner sc) {
        boolean check = false;

        System.out.println("Identificador del cliente:");
        int customerNumber = sc.nextInt();

        System.out.println("Identificador del empleado:");
        int employeeNumber = sc.nextInt();

        String sqlEmployee = "Select employeeNumber from employees where employeeNumber = ?";
        String sqlCustomer = "Select customerNumber from customers where customerNumber = ?";
        String sqlCustomerUpdate = "update customers set salesRepEmployeeNumber=? where customerNumber=?";

        ConexionBD.getConnectionSingleton();

        try {
            PreparedStatement psEmployee = ConexionBD.getCon().prepareStatement(sqlEmployee);
            PreparedStatement psCustomer = ConexionBD.getCon().prepareStatement(sqlCustomer);

            psEmployee.setInt(1, employeeNumber);
            psCustomer.setInt(1, customerNumber);

            ResultSet rsEmployee = psEmployee.executeQuery();
            ResultSet rsCustomer = psCustomer.executeQuery();

            if (rsEmployee.next() && rsCustomer.next()) {
                PreparedStatement updateCustomer = ConexionBD.getCon().prepareStatement(sqlCustomerUpdate);

                updateCustomer.setInt(1, employeeNumber);
                updateCustomer.setInt(2, customerNumber);

                check = updateCustomer.executeUpdate() > 0;

                if (check) {
                    System.out.println("**********************************");
                    System.out.println("Empleado asignado a dicho cliente");
                    System.out.println("**********************************");
                }

            } else {
                System.out.println("**********************************");
                System.out.println("Los datos son incorrectos");
                System.out.println("**********************************");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

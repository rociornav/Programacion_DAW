package dao;

import db.ConexionBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author rocio
 */
public class OrderDAO {
    public static void getOrderDetails(Scanner sc) {

        System.out.println("Identificador de Pedido:");
        int orderNumber = sc.nextInt();

        ConexionBD.getConnectionSingleton();

        String sqlOrder = "select * from orders where orderNumber = ?";
        String sqlOrderDetails = "select productName,quantityOrdered, priceEach from orders inner join orderdetails on orders.orderNumber = orderdetails.orderNumber inner join products on orderdetails.productCode = products.productCode where orders.orderNumber=?";

        try {
            PreparedStatement psOrder = ConexionBD.getCon().prepareStatement(sqlOrder);

            psOrder.setInt(1, orderNumber);

            ResultSet rsOrder = psOrder.executeQuery();

            if (rsOrder.next()) {
                System.out.println("Fecha Pedido: " + rsOrder.getDate(2));
                System.out.println("Fecha Estimada: " + rsOrder.getDate(3));
                System.out.println("Fecha Envio: " + rsOrder.getDate(4));
                System.out.println("Estado: " + rsOrder.getString(5));

                PreparedStatement psOrderDetails = ConexionBD.getCon().prepareStatement(sqlOrderDetails);

                psOrderDetails.setInt(1, orderNumber);

                ResultSet rsOrderDetails = psOrderDetails.executeQuery();

                float totalPrice = 0;

                while (rsOrderDetails.next()) {

                    int quantityOrdered = rsOrderDetails.getInt(2);
                    float priceEach = rsOrderDetails.getFloat(3);
                    System.out.println("Nombre del producto: " + rsOrderDetails.getString(1) + ", Cantidad: "
                            + quantityOrdered + ", Precio por unidad: " + priceEach);
                    totalPrice = totalPrice + (quantityOrdered * priceEach);
                }

                System.out.println("*************************");
                System.out.println("Precio total: " + totalPrice + " ");
                System.out.println("*************************");
            } else {
                System.out.println("*************************");
                System.out.println("El pedido no existe");
                System.out.println("*************************");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void addProductToOrder(Scanner sc) {

        System.out.println("Número de pedido: ");
        int orderNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Código de producto a añadir: ");
        String productCode = sc.nextLine();

        ConexionBD.getConnectionSingleton();

        String sqlOrder = "select * from orders where orderNumber = ?";
        String sqlProduct = "select * from products where productCode = ?";
        String sqlProductAndOrder = "select * from orderdetails where orderNumber=? and productCode=?";
        String sqlUpdateOrder = "update orderdetails set quantityOrdered = ?";
        String sqlAddProduct = "insert into orderdetails(orderNumber,productCode,quantityOrdered, priceEach,orderLineNumber) values(?,?,?,?,?)";

        try {
            PreparedStatement psOrder = ConexionBD.getCon().prepareStatement(sqlOrder);
            PreparedStatement psProduct = ConexionBD.getCon().prepareStatement(sqlProduct);
            PreparedStatement psProductAndOrder = ConexionBD.getCon().prepareStatement(sqlProductAndOrder);

            psOrder.setInt(1, orderNumber);
            psProduct.setString(1, productCode);
            psProductAndOrder.setInt(1, orderNumber);
            psProductAndOrder.setString(2, productCode);

            ResultSet rsOrder = psOrder.executeQuery();
            ResultSet rsProduct = psProduct.executeQuery();
            ResultSet rsProductAndOrder = psProductAndOrder.executeQuery();

            if (rsOrder.next() && rsProduct.next()) {

                System.out.println("Cantidad que desea añadir: ");
                int quantityOrderer = sc.nextInt();

                if (rsProductAndOrder.next()) {

                    PreparedStatement psUpdateOrder = ConexionBD.getCon().prepareStatement(sqlUpdateOrder);

                    psUpdateOrder.setInt(1, (rsProductAndOrder.getInt("quantityOrdered") + quantityOrderer));

                    psUpdateOrder.executeUpdate();

                    System.out.println("*************************");
                    System.out.println("Pedido Actualizado con mayor cantidad");
                    System.out.println("*************************");

                } else {
                    PreparedStatement psAddProduct = ConexionBD.getCon().prepareStatement(sqlAddProduct);

                    psAddProduct.setInt(1, orderNumber);
                    psAddProduct.setString(2, productCode);
                    psAddProduct.setInt(3, quantityOrderer);
                    psAddProduct.setFloat(4, rsProduct.getFloat("buyPrice"));
                    psAddProduct.setInt(5, 3);

                    psAddProduct.executeUpdate();

                    System.out.println("*************************");
                    System.out.println("Product añadido al pedido");
                    System.out.println("*************************");
                }

            } else {
                System.out.println("*************************");
                System.out.println("El producto o el pedido no existen");
                System.out.println("*************************");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

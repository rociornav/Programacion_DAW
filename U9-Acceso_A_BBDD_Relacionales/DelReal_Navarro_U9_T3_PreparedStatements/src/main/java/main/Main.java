package main;

import dao.CustomerDAO;
import dao.OrderDAO;
import db.ConexionBD;
import java.util.Scanner;

/*
Enunciado:

U9_T3 Aplicación con preparedStatements

Utilizando siempre preparedStatements realizar una pequeña aplicación para interactuar con la base de datos.

Dicha aplicación presentará el siguiente menú:

1. Insertar cliente (solicitará los datos del cliente y lo insertará en la base de datos)

2. Asignar empleado a cliente (solicitará los identificadores de cada uno). Si alguno de ellos no existe deberá mostrar un mensaje
 de error.

3. Añadir producto a pedido (solicitará los identificadores de cada uno y la cantidad del producto). Si alguno de ellos no existe
 mostrará un mensaje de error.

4. Mostrar con detalle un pedido. Solicitará el identificador del pedido y mostrará todos los datos del pedido,
los productos que tiene (nombre), la cantidad de los mismos, el precio y el total del coste del pedido. En caso de no existir
ese pedido mostrará un mensaje de error.

5. Salir de la aplicación

NOTA: Cada una las opciones de menú deberá ir desarrollada en su propia función (a excepción de la 5).

NOTA: Puedes necesitar varias consultas para la misma función.
 */

/**
 * @author Rocío del Real
 * Información clase: mostrar menú y probar la funcionalidad de los métodos.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Selecciona una opción: \n 1-Insertar Cliente " + "\n 2-Asignar empleado a cliente "
                    + "\n 3-Añadir producto a pedido " + "\n 4-Mostrar detalle de un pedido "
                    + "\n 5-Salir de la aplicación");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    CustomerDAO.createCustomer(sc);
                    break;
                case 2:
                    CustomerDAO.assignEmployeeToCustomer(sc);
                    break;
                case 3:
                    OrderDAO.addProductToOrder(sc);
                    break;
                case 4:
                    OrderDAO.getOrderDetails(sc);
                    break;
                default:
                    System.out.println("Introduce del 1 al 5");
                    break;
            }

        } while (menu != 5);

        ConexionBD.closeConection();

        sc.close();
    }
}

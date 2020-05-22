
import java.sql.*;
//VERSION Modulada. para una main menos cargada
public class Metodos {

    Connection connection = null;

    public Metodos() {
        try{
            //Nota: uso el jdbc de sqlite en ubuntu
            connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
             /*
            Instalar en ubuntu sqlite: https://www.sqlite.org/download.html /descargar archivo: sqlite-tools-linux-x86-3310100.zip
            al descomprimirlo abrir la terminal y usar estos comandos:
            sudo apt-get install sqlite3
            sudo sqlite3 //esto solo es para entrar y crear/gestionar bbdd dentro, pero no me hace falta para este ejercicio
             */

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void listCustomers()  {
        System.out.println("_____________________________________________________________");
        System.out.println("***Lista de customers donde state es null***");
        System.out.println("_____________________________________________________________");
        System.out.println();

        try {
            /*Usar mejor PreparedStatement a Statement, ya que tiene una seguridad que impide la entrada
            de cualquiera a mi bbdd. Define la consulta sin ejecutarla*/
            PreparedStatement statement = connection.prepareStatement("select * from customers where state is null");

            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery(); //ejecuta la consultaa devuelvendome un objeto ResultSet que es el resultado de esa consulta

            //Recorremos el conjunto de resultados
            while (rs.next()) {
                //Obtenemos un campo de tipo entero
                System.out.println("CustomerNumber :" + rs.getInt("customerNumber"));
                //Obtenemos un campo cadena
                System.out.println("CustomerName :" + rs.getString("customerName"));
                System.out.println("contactLastName :" + rs.getString("contactLastName"));
                System.out.println("contactFirstName :" + rs.getString("contactFirstName"));
                System.out.println("phone :" + rs.getString("phone"));
                System.out.println("addressLine1 :" + rs.getString("addressLine1"));
                System.out.println("addressLine2 :" + rs.getString("addressLine2"));
                System.out.println("city :" + rs.getString("city"));
                System.out.println("state :" + rs.getString("state"));
                System.out.println("postalCode :" + rs.getString("postalCode"));
                System.out.println("country :" + rs.getString("country"));
                //Obtenemos un campo de tipo entero
                System.out.println("salesRepEmployeeNumber :" + rs.getInt("salesRepEmployeeNumber"));
                //Obtenemos un campo tipo Double
                System.out.println("creditLimit :" + rs.getDouble(13));

                System.out.println("-----------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void listPayments(){
        System.out.println("_____________________________________________________________");
        System.out.println("***Lista de payments cuyo 'amount' sea mayor de 30.000.***");
        System.out.println("_____________________________________________________________");
        System.out.println();

        try {
            //Usar mejor PreparedStatement a Statement, ya que tiene una seguridad que impide la entrada
            // de cualquiera a mi bbdd
            //define la consulta sin ejecutarla
            PreparedStatement statement = connection.prepareStatement("select * from payments where amount > 30000");

            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery(); //ejecuta la consultaa devuelvendome un objeto ResultSet que es el resultado de esa consulta

            //Recorremos el conjunto de resultados
            while (rs.next()) {

                System.out.println("CustomerNumber :" + rs.getInt("customerNumber"));
                System.out.println("checkNumber :" + rs.getString("checkNumber"));
                //obtenemos un campo por posicion
                System.out.println("paymentDate :" + rs.getString(3));
                System.out.println("Amount : "+rs.getDouble(4));
                System.out.println("-----------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listEmployees(){
        System.out.println("________________________________________________________________________________");
        System.out.println("***Lista de employees que dan cuenta (reportsTo) al empleado con Id = 1143.***");
        System.out.println("________________________________________________________________________________");
        System.out.println();

        try {
            //Usar mejor PreparedStatement a Statement, ya que tiene una seguridad que impide la entrada
            // de cualquiera a mi bbdd
            //define la consulta sin ejecutarla
            PreparedStatement statement = connection.prepareStatement("select * from employees where reportsTo = 1143");

            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery(); //ejecuta la consultaa devuelvendome un objeto ResultSet que es el resultado de esa consulta

            //Recorremos el conjunto de resultados
            while (rs.next()) {
                System.out.println("employeeNumber :" + rs.getInt("employeeNumber"));
                System.out.println("lastName :" + rs.getString("lastName"));
                System.out.println("firstName :" + rs.getString("firstName"));
                System.out.println("extension :" + rs.getString("extension"));
                System.out.println("email :" + rs.getString("email"));
                System.out.println("officeCode :" + rs.getString("officeCode"));
                System.out.println("reportsTo :" + rs.getInt("reportsTo"));
                System.out.println("jobTitle :" + rs.getString("jobTitle"));
                //System.out.println("birthday :" + rs.getString("birthday"));// tras comprobar en la bbdd no existe ningun campo denominado 'birthday' en la tabla employees

                System.out.println("-----------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}

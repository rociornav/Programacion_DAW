public class MainElegante {
    /*
    Enunciado: 06/05/20 RRN

Utilizando la base de datos (sampledatabase.db) que se proporciona como ejemplo, realizar las siguientes
actividades:

Configura la conexión para acceder a la base de datos.
Realiza las siguientes consultas y muéstralas por pantalla:
Listado de los "customers" que no tienen "state" (el campo "state" es nulo).
Listado de los "payments" cuyo "amount" sea mayor de 30.000.
Listado de los "employees" que dan cuenta (reportsTo) al empleado con Id = 1143

     */
    public static void main(String[] args) {
//VERSION Modulada. para una version menos cargada
        Metodos m1=new Metodos();
        m1.listCustomers();
        m1.listPayments();
        m1.listEmployees();
    }
}

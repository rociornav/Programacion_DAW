package principal;

import ad.ADClassicModels;
import database.ConexionBD;

public class Principal {
    public static void main(String[] args) {

        ADClassicModels metodos = new ADClassicModels();

        System.out.println(metodos.getEmpleados());

        System.out.println(metodos.getOffices());

        ConexionBD.closeConection();

    }
}

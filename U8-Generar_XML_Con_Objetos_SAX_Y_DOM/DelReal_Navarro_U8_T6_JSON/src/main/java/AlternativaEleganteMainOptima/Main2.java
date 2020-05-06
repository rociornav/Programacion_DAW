package AlternativaEleganteMainOptima;

import com.google.gson.Gson;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Futbolista> listaFutbolista = Futbolista.createList();

        Gson gson = new Gson();

        // Paso 3. Convertir el objeto-compuesto a Json
        System.out.println(gson.toJson(listaFutbolista));
    }
}

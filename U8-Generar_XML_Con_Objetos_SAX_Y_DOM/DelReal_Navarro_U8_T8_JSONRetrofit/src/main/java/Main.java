import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.io.IOException;
import java.util.List;
/*
Enunciado:
Teniendo en cuenta el JSON que se adjunta, intenta modelar las clase necesarias (Alumnos y Asignaturas) para realizar una petición Retrofit a la siguiente URL:

baseUrl: https://my-json-server.typicode.com/chemaduran/json_entrega1/

listAlumnos: (baseUrl) + /alumnos?_embed=asignaturas

La clase Alumno deberá contener un ArrayList con objetos de tipo Asignatura.

Se deberá sacar por pantalla el contenido completo del objeto Alumno correspondiente, relleno con la información
recibida de la petición HTTP.

 ver fichero entregable_asignaturas.json
 */

public class Main {
    public static void main(String[] args) {
        /*Paso 1. Crear una instancia retrofit: nos sirve para crear un servicio que nos haga las peticiones
        http para que nos devuelva el json.*/
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/chemaduran/json_entrega1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //Paso 2. Crear variables
        CentralAlumnos service=retrofit.create(CentralAlumnos.class);
        Alumno alumno=null;

        //Paso 3. Obtener lista de alumnos
        System.out.println("Obtenemos el listado completo de alumnos: ");
        try{
            Response<List<Alumno>> response=service.listAlumnos().execute();
            //comprobamos si la respuesta se ha ejecutado correctamente
            if(response.isSuccessful()){
                List<Alumno> alumnos=response.body();
                System.out.println(alumnos);
            }else{
                System.out.println("Peticion no valida: " + response.message());
            }
        } catch (IOException e) {
            System.out.println("Error en la peticion: "+e.getMessage());
        }

    }
}

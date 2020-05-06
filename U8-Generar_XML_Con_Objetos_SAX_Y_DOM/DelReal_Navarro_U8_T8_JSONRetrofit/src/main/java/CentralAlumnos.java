import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface CentralAlumnos {
    //Anotacion get mas llamada.
    //equivalencia--> https://my-json-server.typicode.com/chemaduran/json_entrega1/alumnos?_embed=asignaturas
    @GET("alumnos?_embed=asignaturas")
    Call<List<Alumno>> listAlumnos();
}

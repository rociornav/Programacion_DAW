import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface CentralFutbolistas {
    //Utilizamos una anotcacion de tipo GET
    //equivalente --> https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/jugadores
    @GET("jugadores") //'jugadores' si observamos futbolistas.json, de poner otro nombre logicamente daria error
    Call<List<Futbolista>> listFutbolistas();
}

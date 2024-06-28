import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Moneda buscarMoneda(String monedaActual, String monedaABuscar){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/fe2f7baad3545372cac5d3e1/pair/"+monedaActual+"/"+monedaABuscar);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }
        catch (Exception e){
            throw new RuntimeException("No se reconocé esa moneda");
        }
    }
}



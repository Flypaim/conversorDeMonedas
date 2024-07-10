package calculos;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class buscarDivisa {
    public model.divisaCon buscar(String abreviatura) {
        model.divisaCon moneda = null;
        try {

            String urlStr = "https://v6.exchangerate-api.com/v6/d047705089980a3fde6a606a/latest/USD";

            URL url = new URL(urlStr);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonElement root = JsonParser.parseReader(new InputStreamReader(request.getInputStream()));
            JsonObject jsonObject = root.getAsJsonObject();


            JsonObject jsonInterno = jsonObject.getAsJsonObject("conversion_rates");

            for (String clave : jsonInterno.keySet()) {
                if (clave.equals(abreviatura)) {
                    JsonElement valor = jsonInterno.get(clave);
                    double doubleValor = valor.getAsDouble();
                    moneda = new model.divisaCon(clave, doubleValor);
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Ha surgido un error: " + e.getMessage());
        }
        return moneda;
    }
}
package cuentica;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.RxHttpClient;
import io.reactivex.Flowable;
import org.reactivestreams.Publisher;

import java.net.MalformedURLException;
import java.net.URL;

public class Cuentica {

    public static final String APIURL = "https://api.cuentica.com";

    private final String token;

    private final RxHttpClient client;

    public Cuentica(String token) throws MalformedURLException {
        URL domain = new URL(APIURL);
        client = RxHttpClient.create(domain);
        this.token = token;
    }

    Flowable<HttpResponse<Company>> fetchCompany() {
        return client.exchange(get("/company"), Company.class);
    }

    HttpRequest get(String path) {
        return HttpRequest.GET(path)
                .header("X-AUTH-TOKEN", this.token);
    }
}

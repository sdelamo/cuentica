/*
 * Copyright 2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

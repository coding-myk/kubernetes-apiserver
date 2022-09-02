package com.coding.apiserver.component;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class K8sApiClientComponent {


    private final String token = "eyJhbGciOiJSUzI1NiIsImtpZCI6ImZtWnFtTDlFN0RnUktDbXhRaGhQWmZRY3ZreERKcUh2blV1elZJakYyOUkifQ.eyJhdWQiOlsiaHR0cHM6Ly9rdWJlcm5ldGVzLmRlZmF1bHQuc3ZjLmNsdXN0ZXIubG9jYWwiXSwiZXhwIjoxNjkyNDMyNDg0LCJpYXQiOjE2NjEyMjA0ODQsImlzcyI6Imh0dHBzOi8va3ViZXJuZXRlcy5kZWZhdWx0LnN2Yy5jbHVzdGVyLmxvY2FsIiwia3ViZXJuZXRlcy5pbyI6eyJuYW1lc3BhY2UiOiJ0ZXN0Iiwic2VydmljZWFjY291bnQiOnsibmFtZSI6ImFkbWluIiwidWlkIjoiNDdjMjAyNmUtMWZmYy00ZDY5LTk1ZmMtZDk0YzRkZGQ1OTg2In19LCJuYmYiOjE2NjEyMjA0ODQsInN1YiI6InN5c3RlbTpzZXJ2aWNlYWNjb3VudDp0ZXN0OmFkbWluIn0.MeDB8h_nq_X7jAHX_971z69AG3RZrZ0xK6B9OOrfwa5uck4C1oXBxE7F34WspXI61fEPSaBbfet1qz47nQfRcaj_u428Fpsa-khlwn94fcIuxQUuRlRlOXNi0FCun3w0laPYX9NHdGJ7dSLIFj8LDTVuZxSvhGa7l1YEiuNHRoqggiy3O8yufBzWiNsjo1guMe2CULfK69Jbglu8Jra99m1z1W7DEMXV8G0cuMvHD_tOnAp6oe_4r11GM6ssKStHv9Jhe_tXJB9uDr-xW6k9W0AEwMQscfK-xYjiucYtp_qXvzeNZASPHxCZGgwfkUcPv_5ds-VPFM14rnMlkDQDmw";

    @Bean
    public ApiClient apiClient () throws IOException {
        ApiClient client = Config.fromToken("https://codegg.cn:6443",token,false);
        Configuration.setDefaultApiClient(client);
        return client;
    }


}

package com.coding.apiserver.component;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class K8sApiClientComponent {


    private final String token = "eyJhbGciOiJSUzI1NiIsImtpZCI6Im9lMUNZZ0Jwd0d5NEpORC04LWtuRE9QbUc5TUdHd1liSHMxZFBSWml1ckEifQ.eyJhdWQiOlsiaHR0cHM6Ly9rdWJlcm5ldGVzLmRlZmF1bHQuc3ZjLmNsdXN0ZXIubG9jYWwiXSwiZXhwIjoxNjc2MjYxNDU4LCJpYXQiOjE2NjMzMDE0NTgsImlzcyI6Imh0dHBzOi8va3ViZXJuZXRlcy5kZWZhdWx0LnN2Yy5jbHVzdGVyLmxvY2FsIiwia3ViZXJuZXRlcy5pbyI6eyJuYW1lc3BhY2UiOiJ0ZXN0Iiwic2VydmljZWFjY291bnQiOnsibmFtZSI6ImFkbWluIiwidWlkIjoiOThjNjE0NGItOTM3ZC00ZTA4LWE5NzEtOTc4NTZlYTQ4MjA0In19LCJuYmYiOjE2NjMzMDE0NTgsInN1YiI6InN5c3RlbTpzZXJ2aWNlYWNjb3VudDp0ZXN0OmFkbWluIn0.htYCI05k0rDtQPiI-4b3VBtD1CBWuA8EZdnCaINKUOPu9CN8Kh_J8W06Seu1TLx111uewWLgADKsrlZE9sZtGhP9mZ8457l69OjzYP36lwWSFKzqFApIQn21zzbz2DDgcrAZ-koYADxJ6DIOgCwPCrYCLeOJTro_i519HQRsv4z_3jx1wP4_cHsAenk6hVg4r8hSN7u-SLSUAMp7xA9FT5cyBRv1K-GgDODLiUu6EgISeFdA9WPssNOj2Rk3cXzJAWpH2hM0evOi20Aw4h_IT6CgNlCb7GJI4WVnnbUd9N8cVmWwcx0dlbXT-EY6Dixkv_nEXHbpIPTO1pgscHeoew";

    @Bean
    public ApiClient apiClient () throws IOException {
        ApiClient client = Config.fromToken("https://codegg.cn:6443",token,false);
        Configuration.setDefaultApiClient(client);
        return client;
    }


}

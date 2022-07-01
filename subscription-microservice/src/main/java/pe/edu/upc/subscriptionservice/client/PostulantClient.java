package pe.edu.upc.subscriptionservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.upc.subscriptionservice.model.Postulant;

@FeignClient(name = "user-service", fallback = PostulantHystrixFallbackFactory.class)

public interface PostulantClient {
    @GetMapping(value = "/postulant/{id}")
    public ResponseEntity<Postulant> getPostulant(@PathVariable("id")Long id);
}

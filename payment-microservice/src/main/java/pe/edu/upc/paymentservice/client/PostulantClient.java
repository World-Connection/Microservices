package pe.edu.upc.paymentservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.upc.paymentservice.model.Postulant;

@FeignClient(name = "user-service", fallback = PostulantHystrixFallbackFactory.class)
public interface PostulantClient {
    @GetMapping(value = "/postulant/{id}")
    public ResponseEntity<Postulant> getPostulant(@PathVariable("id")Long id);
}

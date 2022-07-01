package pe.edu.upc.postulation.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.upc.postulation.model.Postulant;



@FeignClient(name = "user-service", fallback = PostulantHystrixFallbackFactory.class)
public interface PostulantClient {
    @GetMapping(value = "/postulant/{id}")
    public ResponseEntity<Postulant> getPostulant(@PathVariable("id")Long id);
}

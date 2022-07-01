package upc.edu.pe.joboffermicroservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import upc.edu.pe.joboffermicroservice.model.Employer;

@FeignClient(name = "user-service", fallback = PostulantHystrixFallbackFactory.class)
public interface EmployerClient {
    @GetMapping(value = "/employer/{id}")
    public ResponseEntity<Employer> getEmployer(@PathVariable("id")Long id);
}
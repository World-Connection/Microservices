package upc.edu.pe.joboffermicroservice.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import upc.edu.pe.joboffermicroservice.model.Employer;

@Component
public class PostulantHystrixFallbackFactory implements EmployerClient{
    @Override
    public ResponseEntity<Employer> getEmployer(Long id) {
        Employer employer = Employer.builder()
                .firstName("none")
                .lastName("none")
                .dni("none")
                .email("none")
                .numberPhone("0")
                .password("none").build();

        return ResponseEntity.ok(employer);
    }
}

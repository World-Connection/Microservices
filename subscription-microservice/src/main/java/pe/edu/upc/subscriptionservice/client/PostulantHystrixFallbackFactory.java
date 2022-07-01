package pe.edu.upc.subscriptionservice.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import pe.edu.upc.subscriptionservice.model.Postulant;

@Component
public class PostulantHystrixFallbackFactory implements PostulantClient{
    @Override
    public ResponseEntity<Postulant> getPostulant(Long id) {
        Postulant postulant = Postulant.builder()
                .firstName("none")
                .lastName("none")
                .civilStatus("none")
                .email("none")
                .number("0")
                .document("none")
                .password("none").build();

        return ResponseEntity.ok(postulant);
    }
}

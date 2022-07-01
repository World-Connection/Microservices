package pe.edu.upc.postulation.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import pe.edu.upc.postulation.model.JobOffer;
import pe.edu.upc.postulation.model.Postulant;

import java.util.Date;

@Component
public class JobOfferClientHystrixFallbackFactory implements JobOfferClient{

    @Override
    public ResponseEntity<JobOffer> getJobOffer(Long id) {
        JobOffer jobOffer = JobOffer.builder()
                .createdAt(new Date())
                .description("none")
                .experience("none")
                .name("none")
                .status("none")
                .build();


        return ResponseEntity.ok(jobOffer);
    }
}

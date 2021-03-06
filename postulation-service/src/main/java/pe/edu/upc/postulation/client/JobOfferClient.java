package pe.edu.upc.postulation.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.upc.postulation.model.JobOffer;

@FeignClient(name = "joboffer-service", fallback = JobOfferClientHystrixFallbackFactory.class)
public interface JobOfferClient {
    @GetMapping(value = "/joboffer/{id}")
    public ResponseEntity<JobOffer> getJobOffer(@PathVariable("id")Long id);
}

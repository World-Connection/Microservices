package pe.edu.upc.paymentservice.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import pe.edu.upc.paymentservice.model.Subscription;

@Component
public class SubscriptionHystrixFallbackFactory implements SubscriptionClient{
    @Override
    public ResponseEntity<Subscription> getSubscription(Long id) {
        Subscription subscription = Subscription.builder()
                .description("none")
                .duration("none")
                .limitPostulations("none")
                .name("none")
                .build();
        return ResponseEntity.ok(subscription);
    }
}

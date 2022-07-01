package pe.edu.upc.subscriptionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.subscriptionservice.entity.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}

package pe.edu.upc.subscriptionservice.service;

import pe.edu.upc.subscriptionservice.entity.Subscription;

import java.util.List;

public interface SubscriptionService {
    public List<Subscription> getAllSubscription();
    public Subscription getSubscription(Long id);
    public Subscription createSubscription(Subscription subscription);
    public Subscription updateSubscription(Subscription subscription);
    public void deleteSubscription(Subscription subscription);
}

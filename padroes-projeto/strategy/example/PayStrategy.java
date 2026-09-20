package example;

/**
 *  Common interface for all strategies
 *  https://refactoring.guru/pt-br/design-patterns/strategy/java/example
 */

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}

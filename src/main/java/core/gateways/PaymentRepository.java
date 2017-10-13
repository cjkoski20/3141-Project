package core.gateways;

import core.entities.Payment;

import java.util.List;

/**
 * Created by ryan on 10/13/17.
 * The Contract that the data storage needs to follow
 */
public interface PaymentRepository {
    // payment will be a class created later, that you should depend on
    List<Payment> getUnFinishedPayments();

    // payments should not be tied of a budget month
    Payment paymentByID(int id);

    // How you save the payment is up to you
    boolean savePayment(Payment payment);

}

package Model;

import Model.Constant.Payment_Mode;
import Model.Constant.Payment_Status;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payment extends Base_Model{
    private LocalDateTime PaymentTime;
    private double Amount;

    @ManyToOne
    private String ReferenceId;

    private Payment_Status paymentStatus;

    private Payment_Mode payment_mode;
}

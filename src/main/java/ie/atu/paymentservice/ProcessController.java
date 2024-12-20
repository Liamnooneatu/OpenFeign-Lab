package ie.atu.paymentservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class ProcessController {

    @PostMapping
    public String makePayment (@RequestBody Person person)
    {
        return "Called the payment service " + person.getName();
    }
}

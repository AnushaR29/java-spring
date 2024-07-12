package cse.poc.spring_poc_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/CustomerController")
@RestController
public class CustomerController {
    private double[] balances = {15000, 9500, 12000, 8000, 6000, 3000, 5000, 11000, 4500,
            2000, 18000, 7500, 9000, 1000, 10000, 6500, 14000, 7000, 500, 16000};

@GetMapping("/balances")
    public double[] getBalances() {
        return balances;
    }
@PutMapping("/updateBalances")
    public double[] updateBalances() {
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] >= 5000 && balances[i] < 10000) {
                balances[i] -= balances[i] * 0.03;
            } else if (balances[i] >= 1000 && balances[i] < 5000) {
                balances[i] -= balances[i] * 0.05;
            }
        }
        return balances;
    }
}
class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
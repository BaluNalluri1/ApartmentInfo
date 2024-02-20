package com.example.ApartmentInfo.Controller;

import com.example.ApartmentInfo.DTO.PaymentRequestDTO;
import com.example.ApartmentInfo.Model.Payment;
import com.example.ApartmentInfo.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping("/createPayment")
    public ResponseEntity<String> createPaymentDetails(@RequestBody PaymentRequestDTO paymentRequestDTO) {
        paymentService.createPaymentDetails(paymentRequestDTO);
        return ResponseEntity.ok("Payment details created successfully.");
    }

    @PostMapping("savepay")
  public Payment savePayment(@RequestBody Payment payment){
        return   paymentService.savePayment(payment);
    }
}


package com.example.sweetimp.controller;

import com.example.sweetimp.model.ContactMessage;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin
public class ContactController {

    @PostMapping
    public String receiveMessage(@RequestBody ContactMessage message) {


        System.out.println("Nome: " + message.getNome());
        System.out.println("Assunto: " + message.getAssunto());
        System.out.println("Mensagem: " + message.getMensagem());

        return "Mensagem recebida com sucesso!";
    }
}

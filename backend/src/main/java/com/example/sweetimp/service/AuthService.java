package com.example.sweetimp.service;

import com.example.sweetimp.model.User;
import com.example.sweetimp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository repo;

    public User register(User user) {
        return repo.save(user);
    }

    public User login(String email, String password) {
        User user = repo.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Senha inválida");
        }
        return user;
    }

    public void resetPassword(String email, String newPassword) {
        User user = repo.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Email não encontrado"));

        user.setPassword(newPassword);
        repo.save(user);
    }
}

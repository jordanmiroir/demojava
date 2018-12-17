package com.example.demo.controller;

import com.example.demo.User;
import com.example.demo.repository.HistoriqueRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private UserService userService;
    @Autowired
    private HistoriqueRepository historiqueRepository;

    @RequestMapping("/historique")
    public User historique(@RequestParam(value = "idUser") Integer idUtilisateur, @RequestParam(value = "action") String action) throws Exception {
        return userService.historiserAction(idUtilisateur,action);
    }

    @RequestMapping("/utilisateur")
    public User utilisateur(@RequestParam(value = "idUser") Integer idUtilisateur) throws Exception {
        return userService.recupereUtilisateur(idUtilisateur);
    }
}

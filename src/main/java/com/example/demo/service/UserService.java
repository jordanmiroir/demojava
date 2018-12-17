package com.example.demo.service;

import com.example.demo.Historique;
import com.example.demo.User;
import com.example.demo.repository.HistoriqueRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HistoriqueRepository historiqueRepository;

    public User historiserAction(Integer idUtilisateur, String action) throws Exception {

        if (userRepository.exists(idUtilisateur)) {
            //Récupère le user
            User u = userRepository.findOne(idUtilisateur);

            Historique h = new Historique();
            h.setAction(action);
            h.setUser(u);

            h = historiqueRepository.save(h);

            //lien avec utilisateur
            u.getHistoriques().add(h);

            //Update
            u = userRepository.save(u);

            return u;
        } else {
            throw new Exception("Vous n'êtes pas enregistré !");
        }


    }

    public User recupereUtilisateur(Integer idUtilisateur) throws Exception {
        if (userRepository.exists(idUtilisateur)) {
            //Récupère le user
            User u = userRepository.findOne(idUtilisateur);
            return u;
        } else {
            throw new Exception("Pas bon!");
        }
    }



        //Quand un utilisateur effectue une action, l'application JAVA doit l'enregistrer pour cet utilisateur.

        // Algo
        // Tant qu'une ACTION est effectuée faire
        // Si UTILISATEUR enregistré alors
        // enregistre l'ACTION (id action, date)
        // Si UTILISATEUR non enregistré alors
        // Enregistre pas l'ACTION


        //Create
        /*User u = UserRepository.save(new User("Léo", "Bergine"));

        //Read
        User u2 = UserRepository.findOne(2);
        u2.setContactMail(new String("vegetable@free.fr"));

        //Update
        u2 = UserRepository.save(u2);

        //Delete
        UserRepository.delete(u2);*/

}


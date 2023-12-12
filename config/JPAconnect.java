/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author THINKPAD
 */
public class JPAconnect {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectLimangatusPU");
        EntityManager em = emf.createEntityManager();
    }

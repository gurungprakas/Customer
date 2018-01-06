/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.myapp.DAOImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Prakas
 */
public class CustomerDAOImpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("CustomerPU");
        EntityManager em=emf.createEntityManager();
        EntityTransaction trans;
        
    }
    
}

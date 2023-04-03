package com.example.demo.insertdata;

import com.example.demo.entity.Brood;
import com.example.demo.entity.BroodType;
import com.example.demo.entity.Unit;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DataInsert {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-persistence-unit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{       
        Brood terran = new Brood();
        terran.setBrood(BroodType.terran);

        Unit liberationShip = new Unit();
        liberationShip.setName("liberationShip");
        liberationShip.setGrand(false);
        liberationShip.setBrood(terran);
        
        em.persist(terran);
        em.persist(liberationShip);
    }
    catch (Exception e) {
        tx.rollback();
    }
    finally {
        em.close();
    }
        emf.close();
}
}
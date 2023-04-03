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
        Brood brood = new Brood();
        brood.setBrood(BroodType.zerg);

        Unit unit = new Unit();
        unit.setName("타락귀");
        unit.setGrand(false);
        unit.setBrood(brood);
        
        em.persist(brood);
        em.persist(unit);

        tx.commit();
    }
    catch (Exception e) {
        tx.rollback();
        e.printStackTrace();
    }
    finally {
        em.close();
        emf.close();
    }
}
}
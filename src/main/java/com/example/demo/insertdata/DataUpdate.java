package com.example.demo.insertdata;

import com.example.demo.entity.Brood;
import com.example.demo.entity.BroodType;
import com.example.demo.entity.Unit;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DataUpdate {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-persistence-unit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            // id가 1인 Brood 조회
            // Brood brood = em.find(Brood.class, 1);

            // id가 1인 Unit 조회
            Unit unit = em.find(Unit.class, 12);

            // 조회된 객체들의 값을 수정
            // brood.setBrood(BroodType.zerg);
            unit.setName("대군주");
            unit.setGrand(false);

            // Brood와 Unit 객체들을 각각 업데이트
            // em.merge(brood);
            em.merge(unit);

            tx.commit(); // 트랜잭션 커밋

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}

// package com.example.demo;

// import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.example.demo.entity.Brood;
// import com.example.demo.entity.BroodType;
// import com.example.demo.entity.Unit;

// import jakarta.persistence.EntityManager;
// import jakarta.persistence.EntityManagerFactory;
// import jakarta.persistence.EntityTransaction;
// import jakarta.persistence.Persistence;


// @SpringBootApplication
// public class DemoApplicationTests {
    
//     public static void main(String[] args)throws Exception {
//         EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("매개변수");
//         EntityManager entityManager = entityManagerFactory.createEntityManager();
//         EntityTransaction entityTransaction = entityManager.getTransaction();
//         entityTransaction.begin();

//         // 브루드 생성
//         Brood brood = new Brood();
//         brood.setBrood(BroodType.terran);
//         entityManager.persist(brood);

//         // 유닛 생성
//         Unit unit = new Unit();
//         unit.setName("해방선");
//         unit.setGrand(false);
//         unit.setBrood(brood);
//         entityManager.persist(unit);

//         entityTransaction.commit();
//         entityManager.close();
//         entityManagerFactory.close();
//     }
// }
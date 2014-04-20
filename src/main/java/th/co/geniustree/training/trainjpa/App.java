/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.training.trainjpa;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Nook
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("trainingJPA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Query resultQuery = em.createQuery("select f from Faculty f");
        List<Faculty> resultList = resultQuery.getResultList(); 
        for (Faculty f:resultList){
            System.out.println(f.getName());
        }
        
//        print(fac);
        
//        printStudent(sta);
//        Faculty fac = em.find(new Faculty().getClass(), (int)(Math.random()*4)+1);
//        Student sta = new Student(10,"Rachata",new Date(),fac);
//        fac.getStudents().add(sta);
//        Query createQuery = em.createQuery("select f from Faculty f order by f.id");
//        List<Faculty> facultyList = createQuery.getResultList();
//        print(facultyList);
//        Faculty eng = new Faculty(5,"science");
//        em.persist(eng);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    static void print(List<Faculty> List) {
        for (Faculty F : List) {
            System.out.println(F.getId() + "\t" + F.getName());
        }
    }

    static void printStudent(List<Student> List) {
        for (Student F : List) {
            System.out.println(F.getId() + "\t" + F.getName());
        }
    }

    static void insertFac() {
    }
}

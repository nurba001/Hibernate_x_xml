package org.example;

import org.example.entity.Student;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

      Student student1 =new Student("Nurbek","Amanbekov","java",21);
    create(student1);

    }
    public static int create(Student student1){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();
        session.save(student1);
        session.getTransaction().commit();
        session.close();
        System.out.println("Add successfully:"+ student1);

        return student1.getId();
    }

}
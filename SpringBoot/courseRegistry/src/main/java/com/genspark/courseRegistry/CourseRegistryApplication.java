package com.genspark.courseRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

@SpringBootApplication
public class CourseRegistryApplication {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Query q = session.createQuery("Update CourseInfo set courseName =: n where courseID =: i");
		q.setParameter("courseName", "Biology");
		q.setParameter("i", 1);
		int status = q.executeUpdate();
		System.out.println(status);

		SpringApplication.run(CourseRegistryApplication.class, args);
	}

}

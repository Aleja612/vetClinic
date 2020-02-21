package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Utils {

	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration().configure();
		StandardServiceRegistryBuilder builder = 
				new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
		SessionFactory sessionFactory = conf.buildSessionFactory(builder.build());
		return sessionFactory;
		}
}

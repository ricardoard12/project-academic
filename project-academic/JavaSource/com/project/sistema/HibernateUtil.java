package com.project.sistema;

import javax.swing.JOptionPane;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {


	private static final SessionFactory session = buildeSessionFactory();

	
	@SuppressWarnings("deprecation")
	private static SessionFactory buildeSessionFactory() {
		// TODO Auto-generated method stub
		try {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
			
		} catch(Throwable e){
			JOptionPane.showMessageDialog(null, "Conexao falhou" + e);
			throw new ExceptionInInitializerError();
			}
		
		}

	public static SessionFactory getSession() {
		return session;
	}
}
	


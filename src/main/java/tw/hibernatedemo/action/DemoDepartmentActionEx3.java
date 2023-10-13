package tw.hibernatedemo.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import tw.hibernatedemo.model.Department;
import tw.hibernatedemo.util.HibernateUtil;

public class DemoDepartmentActionEx3 {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Department dept = new Department();
		dept.setDepartmentName("Masage");
		
		session.save(dept);
		
		session.getTransaction().commit();
		
		HibernateUtil.closeSessionFactory();
	}

}

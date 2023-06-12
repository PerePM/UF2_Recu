package Application;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import jakarta.persistence.Query;
import model.Employees;
import model.Departments;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

   		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
  		session.beginTransaction();
   		System.out.println("I per inserir, qualsevol altre cosa per buscar:");
   		if(sc.nextLine().equalsIgnoreCase("I")){
   	   		System.out.println("Nom: ");
   	   		String nom = sc.nextLine();
   	   		System.out.println("Cognom: ");
   	   		String cognom = sc.nextLine();
   	   		System.out.println("Data naixement: ");
   	   		String data1 = sc.nextLine();
   	   		System.out.println("Gènere: ");
   	   		String genere = sc.nextLine();
   	   		System.out.println("Data d’incorporació: ");
   	   		String data2 = sc.nextLine();
   	   		System.out.println("Salari: ");
   	   		float salari = sc.nextFloat();
   	   		System.out.println("Rol: ");
   	   		String rol = sc.nextLine();
   	   		System.out.println("Departament: ");
   	   		int dept = sc.nextInt();
   	   	Query q = session.createQuery("INSERT INTO employees"
   	   			+ "(last_name, first_name, birth_date, gender, hire_date, role, salary, deptno) VALUES"
   	   			+ "('"+cognom+"', '"+nom+"', '"+data1+"', '"+genere+"', '"+data2+"', '"+rol+"', "+salari+", "+dept+")"
   	   			+ ";");
   	   	
   		}else {
   			System.out.println("Quin departament vols buscar?");
   			Query q = session.createQuery("Select employees.* from employees inner join departaments on departaments.deptno=employees.deptno where departaments.deptname =" + sc.nextLine());
   			List<Employees> employees = q.list();
   			for (Employees e : employees) {
   				System.out.println(e);
   			}
   		}
   		session.getTransaction().commit();
   		session.close();
   		
}
}

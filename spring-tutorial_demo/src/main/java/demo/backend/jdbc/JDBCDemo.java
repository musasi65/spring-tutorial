package demo.backend.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.aop.AppConfig;
import java.util.*;

public class JDBCDemo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		// ApplicationContext ctx = new ClassPathXmlApplicationContext(
		// "datasource.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				JDBCConfig.class);
		// BasicDataSource bds = ctx.getBean(BasicDataSource.class);
		// System.out.println(bds);
		// JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);
		// System.out.println(jt);
		GlobalRepository gr = ctx.getBean(GlobalRepository.class);
		System.out.println(gr);

		//insert
		try {
		 Global g = new Global();
		 g.setUid("12");
		 g.setBelong("192");
		 gr.addGlobal(g);
		 } catch (Exception ex) {
		 ex.printStackTrace();
		 System.out.println("duplicate key!");
		 }

//		// select
//		Global g2 = gr.findOne("1");
//		System.out.println(g2.getBelong());
                
                List<Global> list = gr.finaAll();
                System.out.println(list.size());

	}

}

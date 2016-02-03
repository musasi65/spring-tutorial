package etagtest;

import demo.backend.jdbc.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.aop.AppConfig;

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

		// insert
//		try {
//		 Global g = new Global();
//		 g.setUid("123456789");
//		 g.setBelong("192.168.0.10");
//		 gr.addGlobal(g);
//		 } catch (Exception ex) {
//		 ex.printStackTrace();
//		 System.out.println("duplicate key!");
//		 }

		// select
		Global g2 = gr.findOne("123456");
		System.out.println(g2.getBelong());
	}

}

package demo.aop;

import org.springframework.stereotype.Component;

@Component
public class DBTransactionManager implements TransactionManager {

	@Override
	public void transact() {
		System.out.println("DB transact!!!");
	}

}

package demo.backend.jdbc;

import java.util.*;
public interface GlobalRepository {
	public void addGlobal(Global global);
	public Global findOne(String uid);
        public List<Global> finaAll();
        
}

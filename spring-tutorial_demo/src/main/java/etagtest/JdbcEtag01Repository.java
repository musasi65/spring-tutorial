package etagtest;

import demo.backend.jdbc.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcEtag01Repository implements Etag01Repository {

	private JdbcOperations jdbcOperations;
	private final static String INSERT_GLOBAL = "INSERT INTO global VALUES(?,?)";
        
	private final static String SELECT_data_BY_etag_time = "SELECT * From etag01_test WHERE etag_time<=?";

	public JdbcEtag01Repository(JdbcOperations jdbcOperations) {
		this.jdbcOperations = jdbcOperations;
	}

//	@Override
//	public void addGlobal(Global global) {
//		int row = jdbcOperations.update(INSERT_GLOBAL, global.getUid(),
//				global.getBelong());
//		System.out.println("insert: " + row);
//	}

	@Override
	public Etc01_2travel_time Ana(String etag_time) {
		
            
            return jdbcOperations.queryForObject(SELECT_data_BY_etag_time,
				new Etg_rowMapper(), etag_time);
                
                
	}

            private static class Etg_rowMapper implements RowMapper<Etc01_2travel_time> {

		@Override
		public Etc01_2travel_time mapRow(ResultSet rs, int rowNum) throws SQLException {
			Etc01_2travel_time g = new Etc01_2travel_time();
			g.setUid(rs.getString("uid"));
			g.setBelong(rs.getString("belong"));
			return g;                 
                                            
                            //	private int key_id;
                            //	private String epc;
                            //        private String tid;
                            //        private String station;
                            //        private String lane;
                            //        private String vehicles;
                            //        private String direction;
                            //        private String etag_time;
                            //        private String system_time;
		}

	}
        
//	private static class GlobalrowMapper implements RowMapper<Global> {
//
//		@Override
//		public Global mapRow(ResultSet rs, int rowNum) throws SQLException {
//			Global g = new Global();
//			g.setUid(rs.getString("uid"));
//			g.setBelong(rs.getString("belong"));
//			return g;
//		}
//
//	}

}

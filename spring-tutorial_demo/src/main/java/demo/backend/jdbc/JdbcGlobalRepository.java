package demo.backend.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcGlobalRepository implements GlobalRepository {

	private JdbcOperations jdbcOperations;
	private final static String INSERT_GLOBAL = "INSERT INTO global VALUES(?,?)";
	private final static String SELECT_GLOBAL_BY_UID = "SELECT * From global WHERE uid=?";

	public JdbcGlobalRepository(JdbcOperations jdbcOperations) {
		this.jdbcOperations = jdbcOperations;
	}

	@Override
	public void addGlobal(Global global) {
		int row = jdbcOperations.update(INSERT_GLOBAL, global.getUid(),
				global.getBelong());
		System.out.println("insert: " + row);
	}

	@Override
	public Global findOne(String uid) {
            try{
		return jdbcOperations.queryForObject(SELECT_GLOBAL_BY_UID,
				new GlobalrowMapper(), uid);
            }catch(org.springframework.dao.EmptyResultDataAccessException ex){
                return null;
            }
	}

    @Override
    public List<Global> finaAll() {
        return jdbcOperations.query("SELECT * from global", new GlobalrowMapper());
    }

	private static class GlobalrowMapper implements RowMapper<Global> {

		@Override
		public Global mapRow(ResultSet rs, int rowNum) throws SQLException {
			Global g = new Global();
			g.setUid(rs.getString("uid"));
			g.setBelong(rs.getString("belong"));
			return g;
		}

	}

}

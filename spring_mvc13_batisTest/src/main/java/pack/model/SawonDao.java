package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

//repository means "storage"
@Repository	
public class SawonDao extends SqlSessionDaoSupport implements SawonInter {
	
	@Autowired
	public SawonDao(SqlSessionFactory factory){
		System.out.println("SawonDao(SqlSessionFactory factory) - constructor");
		setSqlSessionFactory(factory);
	}

	public List<SawonDto> selectList() throws DataAccessException {
		System.out.println("SawonDao.this.selectList()");
		return getSqlSession().selectList("selectDataAll");
	}
	
	public List<SawonDto> selectBuser() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}
	
}

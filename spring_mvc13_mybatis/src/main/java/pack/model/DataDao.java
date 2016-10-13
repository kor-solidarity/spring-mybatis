package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import pack.controller.SangpumBean;



@Repository
public class DataDao extends SqlSessionDaoSupport implements DataInter{
	//10.10-3-47
	@Autowired
	public DataDao(SqlSessionFactory factory) {
		System.out.println("DataDao.public DataDao(SqlSessionFactory factory) - AKA constructor");
		setSqlSessionFactory(factory);
	}
	
	
	//10.10-3-49
	public List<SangpumDto> list() throws DataAccessException {
		System.out.println("DataDao.public List<SangpumDto> list() throws DataAccessException");
		return getSqlSession().selectList("selectDataAll");
	}
	
	public List<SangpumDto> search(SangpumBean bean) throws DataAccessException {
		System.out.println("DataDao.public List<SangpumDto> search(SangpumBean bean) throws DataAccessException");
		//10.10-3-5025
		return getSqlSession().selectList("selectSearch", bean);
	}
	
	
}

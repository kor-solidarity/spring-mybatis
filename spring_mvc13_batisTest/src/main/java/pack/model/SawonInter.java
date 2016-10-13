package pack.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface SawonInter {
	List<SawonDto> selectList() throws DataAccessException;
	List<SawonDto> selectBuser() throws DataAccessException;
	
}

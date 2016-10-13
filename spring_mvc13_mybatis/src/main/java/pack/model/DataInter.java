package pack.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

import pack.controller.SangpumBean;

public interface DataInter {
	//10.10-3-4415
	List<SangpumDto> list() throws DataAccessException;
	List<SangpumDto> search(SangpumBean bean) throws DataAccessException;
	
	
}

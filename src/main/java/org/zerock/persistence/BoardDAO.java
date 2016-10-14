package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardDAO {
	
	public List<BoardVO> listAll()throws Exception;

}

package org.gokuma.service;

import java.util.List;

import org.gokuma.domain.BoardVO;

public interface BoardService {
	
	// create
	public void regist(BoardVO board) throws Exception;
	
	// read 
	public BoardVO read(Integer bno) throws Exception;
	
	// update
	public void modify(BoardVO board) throws Exception;
	
	// delete
	public void remove(Integer bno) throws Exception;
	
	// listAll
	public List<BoardVO> listAll() throws Exception;
}
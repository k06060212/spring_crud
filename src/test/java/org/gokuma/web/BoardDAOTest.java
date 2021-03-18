package org.gokuma.web;

import javax.inject.Inject;

import org.gokuma.domain.BoardVO;
import org.gokuma.persistence.BoardDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardDAOTest {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);

	@Inject
	private BoardDAO dao;
	
	@Test
	public void testCreate() throws Exception{
		
		BoardVO board = new BoardVO();
		board.setTitle("제목을 넣습니다.");
		board.setContent("내용");
		board.setWriter("작성자");
		
		dao.create(board);
	}
	
	@Test
	public void testRead() throws Exception{
		
		logger.info(dao.read(10).toString());
		
	}
	
	@Test
	public void testUpdate() throws Exception{
		BoardVO board = new BoardVO();
		board.setBno(1);
		board.setTitle("수정된 글");
		board.setContent("수정 내용");
		dao.update(board);
	}
	
	@Test
	public void testDelete() throws Exception{
		
		dao.delete(2);
		
	}
}

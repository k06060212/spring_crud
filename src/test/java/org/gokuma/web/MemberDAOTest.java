package org.gokuma.web;

import javax.inject.Inject;

import org.gokuma.domain.MemberVO;
import org.gokuma.persistence.MemberDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception {
		
		System.out.println(dao.getTime());
		
	}
	
	@Test
	public void testInsertMember() throws Exception{
		
		MemberVO vo = new MemberVO();
		// test시 userid 는 primary key로 설정되어 있으므로 변경 후 테스트 해볼 것
		vo.setUserid("user04");
		vo.setUserpw("user00");
		vo.setUsername("user04");
		vo.setEmail("user04@aaa.com");
		
		dao.insertMember(vo);
	}
	
	@Test
	public void testreadMemberVO() throws Exception{
		
		dao.readMemberVO("user02");
	}
	
	@Test
	public void testreadWithPW() throws Exception{
		
		dao.readWithPW("user02", "user00");
	}
}

package org.gokuma.persistence;

import org.gokuma.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime();
	
	public void insertMember(MemberVO vo);
	
	public MemberVO readMemberVO(String userid) throws Exception;
	
	public MemberVO readWithPW(String userid, String userpw) throws Exception;
}

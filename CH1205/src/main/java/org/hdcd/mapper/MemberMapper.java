package org.hdcd.mapper;

import java.util.List;

import org.hdcd.domain.MemberAuth;
import org.hdcd.domain.Member;

public interface MemberMapper {

	public void create(Member member) throws Exception;

	public void createAuth(MemberAuth memberAuth) throws Exception;

}

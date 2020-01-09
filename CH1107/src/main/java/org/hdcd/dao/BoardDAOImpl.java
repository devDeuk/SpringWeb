package org.hdcd.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.hdcd.domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession session;

	private static String namespace = "org.hdcd.mapper.BoardMapper";

	@Override
	public void create(Board board) throws Exception {
		session.insert(namespace + ".create", board);
	}

	@Override
	public Board read(Integer boardNo) throws Exception {
		return session.selectOne(namespace + ".read", boardNo);
	}

	@Override
	public void update(Board board) throws Exception {
		session.update(namespace + ".update", board);
	}

	@Override
	public void delete(Integer boardNo) throws Exception {
		session.delete(namespace + ".delete", boardNo);
	}

	@Override
	public List<Board> list() throws Exception {
		return session.selectList(namespace + ".list");
	}

}

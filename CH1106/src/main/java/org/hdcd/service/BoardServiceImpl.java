package org.hdcd.service;

import java.util.List;

import org.hdcd.domain.Board;
import org.hdcd.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository repository;

	@Override
	@Transactional
	public void register(Board board) throws Exception {
		repository.save(board);
	}

	@Override
	@Transactional(readOnly = true)
	public Board read(Integer boardNo) throws Exception {
		return repository.findOne(boardNo);
	}

	@Override
	@Transactional
	public void modify(Board board) throws Exception {
		Board boardEntity = repository.findOne(board.getBoardNo());

		boardEntity.setTitle(board.getTitle());
	}

	@Override
	@Transactional
	public void remove(Integer boardNo) throws Exception {
		repository.delete(boardNo);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Board> list() throws Exception {
		return repository.findAll(new Sort(Direction.DESC, "boardNo"));
	}

}

package org.hdcd.controller;

import java.util.Date;

import org.hdcd.domain.Board;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET, produces = "application/xml")
	public ResponseEntity<Board> readToXml(@PathVariable("boardNo") int boardNo) {
		logger.info("readToXml");

		Board board = new Board();

		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());

		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);

		return entity;
	}

	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Board> readToJson(@PathVariable("boardNo") int boardNo) {
		logger.info("readToJson");

		Board board = new Board();

		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());

		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);

		return entity;
	}

	@RequestMapping(value = "/{boardNo}", method = RequestMethod.GET)
	public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo) {
		logger.info("read");

		Board board = new Board();
		
		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());

		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);

		return entity;
	}

}

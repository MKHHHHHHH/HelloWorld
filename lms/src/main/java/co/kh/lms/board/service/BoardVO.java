package co.kh.lms.board.service;

import java.sql.Date;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {
	private int boardId;
	private String boardWriter;
	private String boardTitle;
	private String boardSubject;
	private LocalDate boardDate;
	private int boardHit;
}

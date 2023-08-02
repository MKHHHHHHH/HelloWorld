package co.micol.privateproject.board.service;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {
	private int boardId;
	private String boardWriter;
	private String boardTitle;
	private String boardSubject;
	private Date boardDate;
	private int boardHit;

	public String toString() {
		System.out.print(boardId + "\t");
		System.out.print(boardWriter + "\t");
		System.out.print(boardTitle + "\t");
		System.out.print(boardSubject + "\t");
		System.out.print(boardDate + "\t");
		System.out.println(boardHit + "\t");

		return null;
	}

}
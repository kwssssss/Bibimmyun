package org.galapagos.common.cli.ui;

import org.galapagos.command.Command;

// 1개의 메뉴를 나타냄(목록, 검색, 종료)
public class MenuItem {
	private String title; // 메뉴 제목(타이틀)
	private Command cmd; // 해당 메뉴를 실행할 명령

	// 생성자
	public MenuItem(String title, Command cmd) {
		super();
		this.title = title;
		this.cmd = cmd;
	}

	// Getter
	public String getTitle() {
		return title;
	}

	public void execute() {
		if (cmd != null) {
			cmd.execute();
		}

	}

}

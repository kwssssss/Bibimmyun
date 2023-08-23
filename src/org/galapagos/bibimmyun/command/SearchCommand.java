package org.galapagos.bibimmyun.command;

import org.galapagos.common.cli.command.Command;

public class SearchCommand implements Command {

	@Override
	public void execute() {
		// 실제 검색 작업 진행
		System.out.println("검색을 실행합니다.");
	}

}

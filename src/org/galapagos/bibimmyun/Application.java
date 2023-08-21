package org.galapagos.bibimmyun;

import org.galapagos.common.cli.input;

public class Application {

	public static void main(String[] args) {
		while (true) {
			System.out.println("번호를 선택하세요. 1] 목록 2] 검색 3] 종료");
			int sel = input.readInt("선택 > ");
			if (sel == 1) {
				System.out.println("목록을 실행합니다.");
			} else if (sel == 2) {
				System.out.println("검색을 실행합니다.");
			} else if (sel == 3) {
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}

	}

	public static void testInputInt() {
		int sel = input.readInt("선택 > ");
		System.out.println("선택번호: " + sel);

		sel = input.readInt("선택 > ");
		System.out.println("선택번호: " + sel);
	}
}

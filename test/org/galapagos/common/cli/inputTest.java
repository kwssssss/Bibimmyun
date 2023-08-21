package org.galapagos.common.cli;

public class inputTest {
	public static void main(String[] args) {
		testInputInt();
	}

	public static void testInputInt() {
		int sel = input.readInt("선택 > ");
		System.out.println("선택번호: " + sel);

		sel = input.readInt("선택 > ");
		System.out.println("선택번호: " + sel);
	}
}

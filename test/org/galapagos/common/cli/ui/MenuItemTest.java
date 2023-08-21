package org.galapagos.common.cli.ui;

import org.galapagos.command.ExitCommand;
import org.galapagos.command.ListCommand;
import org.galapagos.command.SearchCommand;

public class MenuItemTest {

	public static void main(String[] args) {
		MenuItem listItem = new MenuItem("목록", new ListCommand());

		System.out.println(listItem.getTitle());
		listItem.execute();

	}

	public static void main1(String[] args) {
		MenuItem searchItem = new MenuItem("검색", new SearchCommand());

		System.out.println(searchItem.getTitle());
		searchItem.execute();

	}

	public static void main2(String[] args) {
		MenuItem exitItem = new MenuItem("종료", new ExitCommand());

		System.out.println(exitItem.getTitle());
		exitItem.execute();

	}

}

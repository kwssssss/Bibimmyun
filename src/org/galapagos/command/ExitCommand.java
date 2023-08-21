package org.galapagos.command;

public class ExitCommand implements Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("죵료합니다.");
		System.exit(0);
	}

}

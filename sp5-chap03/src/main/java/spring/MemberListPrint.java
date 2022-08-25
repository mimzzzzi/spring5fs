package spring;

import java.util.Collection;

public class MemberListPrint {
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public MemberListPrint(MemberDao memberDao, MemberPrinter print) {
		this.memberDao = memberDao;
		this.printer = print;
	}
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m->printer.print(m));
	}
}

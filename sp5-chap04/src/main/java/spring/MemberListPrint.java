package spring;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberListPrint {
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public MemberListPrint() {
		
	}
	
	
	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m->printer.print(m));
	}
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}@Autowired
	public void setMemberPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
}

package spring;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("listPrinter")
public class MemberListPrint {

	private MemberDao memberDao;
	private MemberPrinter printer;

	public MemberListPrint() {
	}
	
	public MemberListPrint(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}

	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
	}

	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Autowired
	public void setMemberPrinter(MemberSummaryPrinter printer) {
		this.printer = printer;
	}
}
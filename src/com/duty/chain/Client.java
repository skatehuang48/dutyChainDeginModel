package com.duty.chain;

import com.duty.chain.handler.CompanyLeader;
import com.duty.chain.handler.DeptLeader;
import com.duty.chain.handler.Leader;
import com.duty.chain.handler.TeamLeader;

public class Client {
	public static void main(String[] args) {
		//ģ������
		Employee request = new Employee();
		request.setReason("��ȥ����");
		request.setRestDays(5);
		request.setUserName("����");
		
		//���������� С��-����-��˾
		Leader companyLeader = new CompanyLeader();
		Leader deptLeader = new DeptLeader(companyLeader);
		Leader teamLeader = new TeamLeader(deptLeader);
		teamLeader.handleRequest(request);
	}
}

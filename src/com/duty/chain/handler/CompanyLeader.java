package com.duty.chain.handler;

import com.duty.chain.Employee;

public class CompanyLeader implements Leader {
	
	@Override
	public void handleRequest(Employee restReques) {
		System.out.println("���ǹ�˾�쵼������3�����ϵļ���");
		System.out.println("======��������ͳһ======");
		System.out.println("------Ա�����봦�����-----------");
	}

	@Override
	public void toNextHandler(Leader leader, Employee restReques) {
	}


}

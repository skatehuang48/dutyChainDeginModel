package com.duty.chain.handler;

import com.duty.chain.Employee;

public class CompanyLeader implements Leader {
	
	@Override
	public void handleRequest(Employee restReques) {
		System.out.println("我是公司领导，处理3天以上的假期");
		System.out.println("======假期审批统一======");
		System.out.println("------员工申请处理完成-----------");
	}

	@Override
	public void toNextHandler(Leader leader, Employee restReques) {
	}


}

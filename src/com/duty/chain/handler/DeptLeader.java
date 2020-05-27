package com.duty.chain.handler;

import com.duty.chain.Employee;

public class DeptLeader implements Leader {
	private Leader leader;
	public DeptLeader(Leader leader){
		this.leader = leader;
	}
	
	@Override
	public void handleRequest(Employee restReques) {
		if(restReques.getRestDays() <= 3){
			//小于3天部门领导自行处理，超出交给公司领导处理
			System.out.println("我是部门领导，处理3天以下的假期");
			System.out.println("------员工申请处理完成-----------");
		}else{
			toNextHandler(leader, restReques);
		}

	}

	@Override
	public void toNextHandler(Leader leader, Employee restReques) {
		System.out.println(restReques.getRestDays()+"天假期----------超出部门领导权限，转交公司领导审批------");
		leader.handleRequest(restReques);
	}

}

package com.duty.chain.handler;

import com.duty.chain.Employee;
/**
 * 小组领导审批员工申请，超出权限交给部门领导审批
 *
 */
public class TeamLeader implements Leader {

	private Leader leader;
	public TeamLeader(Leader leader){
		this.leader = leader;
	}
	
	@Override
	public void handleRequest(Employee restReques) {
		if(restReques.getRestDays() <= 1){
			//小于一天小组领导自行处理，超出交给部门领导处理
			System.out.println("我是小组领导，处理一天以下的假期");
			System.out.println("------员工申请处理完成-----------");
		}else{
			toNextHandler(leader, restReques);
		}
	}

	@Override
	public void toNextHandler(Leader leader, Employee restReques) {
		System.out.println(restReques.getRestDays()+"天假期----------超出小组领导权限，转交部门领导审批------");
		leader.handleRequest(restReques);
	}

}

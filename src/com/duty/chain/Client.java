package com.duty.chain;

import com.duty.chain.handler.CompanyLeader;
import com.duty.chain.handler.DeptLeader;
import com.duty.chain.handler.Leader;
import com.duty.chain.handler.TeamLeader;

public class Client {
	public static void main(String[] args) {
		//模拟请求
		Employee request = new Employee();
		request.setReason("出去游玩");
		request.setRestDays(5);
		request.setUserName("张三");
		
		//构建责任链 小组-部门-公司
		Leader companyLeader = new CompanyLeader();
		Leader deptLeader = new DeptLeader(companyLeader);
		Leader teamLeader = new TeamLeader(deptLeader);
		teamLeader.handleRequest(request);
	}
}

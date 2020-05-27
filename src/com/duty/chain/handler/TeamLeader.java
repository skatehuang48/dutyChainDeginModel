package com.duty.chain.handler;

import com.duty.chain.Employee;
/**
 * С���쵼����Ա�����룬����Ȩ�޽��������쵼����
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
			//С��һ��С���쵼���д����������������쵼����
			System.out.println("����С���쵼������һ�����µļ���");
			System.out.println("------Ա�����봦�����-----------");
		}else{
			toNextHandler(leader, restReques);
		}
	}

	@Override
	public void toNextHandler(Leader leader, Employee restReques) {
		System.out.println(restReques.getRestDays()+"�����----------����С���쵼Ȩ�ޣ�ת�������쵼����------");
		leader.handleRequest(restReques);
	}

}

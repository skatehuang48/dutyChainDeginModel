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
			//С��3�첿���쵼���д�������������˾�쵼����
			System.out.println("���ǲ����쵼������3�����µļ���");
			System.out.println("------Ա�����봦�����-----------");
		}else{
			toNextHandler(leader, restReques);
		}

	}

	@Override
	public void toNextHandler(Leader leader, Employee restReques) {
		System.out.println(restReques.getRestDays()+"�����----------���������쵼Ȩ�ޣ�ת����˾�쵼����------");
		leader.handleRequest(restReques);
	}

}

package com.duty.chain.handler;

import com.duty.chain.Employee;

/**
 * �������߽�ɫ
 * ������Ϊ��С���쵼-�������쵼-����˾�쵼
 *
 */
public interface Leader {
	//��������
	public void handleRequest(Employee restReques);
	
	//���������ģ�ָ����һ����ڵ�
	public void toNextHandler(Leader leader,Employee restReques);
}

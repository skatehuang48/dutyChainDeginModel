package com.duty.chain.handler;

import com.duty.chain.Employee;

/**
 * 抽象处理者角色
 * 责任链为：小组领导-》部门领导-》公司领导
 *
 */
public interface Leader {
	//处理请求
	public void handleRequest(Employee restReques);
	
	//责任链核心，指定下一处理节点
	public void toNextHandler(Leader leader,Employee restReques);
}

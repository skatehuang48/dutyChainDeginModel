package com.duty.chain;
/**
 * 员工类，模拟请求发送
 * @author Administrator
 *
 */
public class Employee {
	private String userName;
	private int restDays;
	private String reason;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getRestDays() {
		return restDays;
	}
	public void setRestDays(int restDays) {
		this.restDays = restDays;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.userName + " 因 " + this.reason + " 请假 "+this.restDays+" 天。";
	}
}

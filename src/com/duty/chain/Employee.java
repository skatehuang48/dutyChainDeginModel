package com.duty.chain;
/**
 * Ա���࣬ģ��������
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
		return this.userName + " �� " + this.reason + " ��� "+this.restDays+" �졣";
	}
}

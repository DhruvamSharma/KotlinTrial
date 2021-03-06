package com.fil.dao.database.entity;

import java.sql.Date;

public class SupplyEntity {

	private int sid;
	private int supply_id;
	private int pid;
	private int qty;
	private Date date;
	
	
	public SupplyEntity(int sid, int supply_id, int pid, int qty, Date date) {
		super();
		this.sid = sid;
		this.supply_id = supply_id;
		this.pid = pid;
		this.qty = qty;
		this.date = date;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSupply_id() {
		return supply_id;
	}
	public void setSupply_id(int supply_id) {
		this.supply_id = supply_id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}

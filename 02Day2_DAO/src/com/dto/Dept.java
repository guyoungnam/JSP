package com.dto;

public class Dept {
	
	private int deptno;
	private String dname;
	private String loc;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
		
		
	}
	public Dept(int depntno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getDepntno() {
		return deptno;
	}
	public void setDepntno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [depntno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	

}

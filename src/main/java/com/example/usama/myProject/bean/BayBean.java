package com.example.usama.myProject.bean;

import java.io.Serializable;

public class BayBean implements Serializable{

	private static final long serialVersionUID = 4825404968787595974L;

	private String bayCod;
	
	private Long progressive;

	public BayBean(String bayCod, Long progressive) {
		super();
		this.bayCod = bayCod;
		this.progressive = progressive;
	}

	public String getBayCod() {
		return bayCod;
	}

	public void setBayCod(String bayCod) {
		this.bayCod = bayCod;
	}

	public Long getProgressive() {
		return progressive;
	}

	public void setProgressive(Long progressive) {
		this.progressive = progressive;
	}

	@Override
	public String toString() {
		return "BayBean [bayCod=" + bayCod + ", progressive=" + progressive + "]";
	}
	
}

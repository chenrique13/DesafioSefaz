package com.carlospereira.desafiosefaz.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer status;
	private String msg;
	private long timeStramp;

	public StandardError(Integer status, String msg, long timeStramp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStramp = timeStramp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public long getTimeStramp() {
		return timeStramp;
	}

	public void setTimeStramp(long timeStramp) {
		this.timeStramp = timeStramp;
	}

}

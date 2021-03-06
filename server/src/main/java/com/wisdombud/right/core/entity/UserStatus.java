package com.wisdombud.right.core.entity;

/**
 * Version: 1.0
 */
public enum UserStatus {

	normal("正常状态"), blocked("封禁状态");

	private final String info;

	private UserStatus(String info) {
		this.info = info;
	}

	public String getInfo() {
		return this.info;
	}
}

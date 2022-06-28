package com.day7.session2.streams_ex;

import java.util.Arrays;
import java.util.List;
import java.time.LocalDateTime;

class Transaction {
	public Integer transationId;
	public LocalDateTime time;
	public String type;
	public String remarks;
	public Double amount;

	public Transaction(Integer transationId, 
			LocalDateTime time, String type, String remarks, Double amount) {
		this.transationId = transationId;
		this.time = time;
		this.type = type;
		this.remarks = remarks;
		this.amount = amount;
	}
}

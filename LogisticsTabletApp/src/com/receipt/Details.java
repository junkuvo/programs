package com.receipt;

public class Details {
	private String status;
	private String receiptLineNumber;
	private String sku;
	private String description;
	private String qtyExpected;
	private String qtyReceived;
	
	
	public Details() {
		setStatus("");
		setReceiptLineNumber("");
		setSku("");
		setDescription("");
		setQtyExpected("");
		setQtyReceived("");
	}


	public String getReceiptLineNumber() {
		return receiptLineNumber;
	}


	public void setReceiptLineNumber(String receiptLineNumber) {
		this.receiptLineNumber = receiptLineNumber;
	}


	public String getSku() {
		return sku;
	}


	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getQtyExpected() {
		return qtyExpected;
	}


	public void setQtyExpected(String qtyExpected) {
		this.qtyExpected = qtyExpected;
	}


	public String getQtyReceived() {
		return qtyReceived;
	}


	public void setQtyReceived(String qtyReceived) {
		this.qtyReceived = qtyReceived;
	}
	
}

package com.receipt;

public class Receipts {
	private String externReceiptKey;
	private String status;
	private String expectedReceiptDate;
	private String receiptDate;
	private String supplierName;
	public Details[] details;
	private String qtyExpected;
	private String qtyReceived;

	
	public Receipts() {
		setStatus("");
		setExternReceiptKey("");
		setReceiptDate("");
		setExpectedReceiptDate("");
		setSupplierName("");
		setQtyExpected("");
		setQtyReceived("");
	}

	public String getExternReceiptKey() {
		return externReceiptKey;
	}

	public void setExternReceiptKey(String externReceiptKey) {
		this.externReceiptKey = externReceiptKey;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getExpectedReceiptDate() {
		return expectedReceiptDate;
	}

	public void setExpectedReceiptDate(String expectedReceiptDate) {
		this.expectedReceiptDate = expectedReceiptDate;
	}

	public String getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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

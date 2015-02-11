package com.metlife.gs.to;

/**
 * @author
 * 
 */
public class PdfTO {
	private String pdfField;

	private String webServiceData;

	public String getPdfField() {
		return pdfField;
	}

	public void setPdfField(String pdfField) {
		this.pdfField = pdfField;
	}

	public String getWebServiceData() {
		return webServiceData;
	}

	public void setWebServiceData(String webServiceData) {
		this.webServiceData = webServiceData;
	}

	public PdfTO(String pdfField, String webServiceData) {
		super();
		this.pdfField = pdfField;
		this.webServiceData = webServiceData;
	}

}

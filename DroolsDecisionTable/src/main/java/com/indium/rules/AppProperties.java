package com.indium.rules;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class AppProperties {

	private String fileNameDrl;
	private String fileNameXls;

	public String getFileNameDrl() {
		return fileNameDrl;
	}

	public void setFileNameDrl(String fileNameDrl) {
		this.fileNameDrl = fileNameDrl;
	}

	public String getFileNameXls() {
		return fileNameXls;
	}

	public void setFileNameXls(String fileNameXls) {
		this.fileNameXls = fileNameXls;
	}
}
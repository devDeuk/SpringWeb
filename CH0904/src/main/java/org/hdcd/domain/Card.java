package org.hdcd.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Future;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Card implements Serializable {

	private static final long serialVersionUID = 1433342994761080681L;

	@NotBlank
	private String no;

	@Future
	@DateTimeFormat(pattern = "yyyyMMdd")
	private Date validMonth;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Date getValidMonth() {
		return validMonth;
	}

	public void setValidMonth(Date validMonth) {
		this.validMonth = validMonth;
	}

}

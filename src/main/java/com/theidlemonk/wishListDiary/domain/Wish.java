package com.theidlemonk.wishListDiary.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Wish {

	@NotNull
    @Size(min=3, max=255)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

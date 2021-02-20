package org.leave.app.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Varun
 *
 */
@ApiModel("User property DTO representation")
@JsonSerialize
public class UserDTO {

	@NotNull(message = "Mobile number cannot be empty")
	@ApiModelProperty(notes = "Mobile Number")
	private Long mobile;
	@NotBlank
	@ApiModelProperty(notes = "Password")
	private String password;

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserDTO object having mobile : " + this.mobile;
	}
}

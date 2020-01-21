package com.muscle.studio.payload;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by rajeevkumarsingh on 02/08/17.
 */
@ApiModel(description = "Details of sign up ")
public class SignUpRequest {
	
	@ApiModelProperty(notes = "the name shouldn't be blank")
    @NotBlank
    @Size(min = 4, max = 40)
    private String name;

	@ApiModelProperty(notes = "the username should unique")
    @NotBlank
    @Size(min = 3, max = 15)
    private String username;

	@ApiModelProperty(notes = "the email address is mandotory")
    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

	@ApiModelProperty(notes = "password length should be minimum 6 and maximum 20 characters")
    @NotBlank
    @Size(min = 6, max = 20)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

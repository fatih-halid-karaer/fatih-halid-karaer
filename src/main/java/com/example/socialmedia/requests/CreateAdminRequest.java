package com.example.socialmedia.requests;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAdminRequest {
	@NotNull
	@NotBlank
	@Size(min=3, max=20)
	private String name;
	
	@NotNull
	@NotBlank
	@Size(min=3, max=20)
    private String adminBio;
	@NotNull
	@NotBlank
	@Size(min=3, max=20)
	 private String adminMail;
}

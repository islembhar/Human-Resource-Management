package com.igrh.model.dto;

import com.igrh.model.entities.Grade;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmployeeDTO(
	@NotBlank
	String nom,
	@NotBlank
	String prenom,
	@Email
	@NotBlank(message = "l'eamail ne doit pas etre vide")
	String email,
	@NotBlank
	String password,
	@NonNull
	Grade grade 
	                ){}

package com.example.demo;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.lang.NonNull;

public class producto {
	
@NotBlank(message = "el codigo no puede estar vacio")
@Size(max = 12, message = "El codigo debe ser unico y tenes un maximo de 12 digitos")
private String codigo;

@NotBlank(message = "el nombre no puede estar vacio")
@Size(max = 100, message = "El nombre tiene un maximo de 100 caracteres")
@NonNull
private String nombre;

@NotBlank(message = "el marca no puede estar vacio")
@NotNull
@Size(max = 100, message = "la marca debe tener un maximo de 100 caracteres")
private String marca;

@NotBlank(message = "el descripcion no puede estar vacio")
@NotNull
@Size(max = 500, message = "la descripcion no debe tener mas de 500 caracteres")
private String descripcion;


@NumberFormat(style = Style.NUMBER)
@Positive
@Digits(fraction = 0, integer = 10, message = "el numero debe ser entero")
private Integer existencias;

@NotBlank(message = "fecha no puede estar vacio")
@DateTimeFormat(pattern = "dd/MM/yyyy")
private String fecha;


public String getCodigo() {
	return codigo;
}


public void setCodigo(String codigo) {
	this.codigo = codigo;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public String getDescripcion() {
	return descripcion;
}


public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}


public Integer getExistencias() {
	return existencias;
}


public void setExistencias(Integer existencias) {
	this.existencias = existencias;
}


public String getFecha() {
	return fecha;
}


public void setFecha(String fecha) {
	this.fecha = fecha;
}


}

package com.krakedev.persistencia.entidades;

public class EstadoCivil {
	private String codigo;
	private String descripcion;
	
	public EstadoCivil() {}
	public EstadoCivil(String codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "EstadoCivil [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
	
	

}

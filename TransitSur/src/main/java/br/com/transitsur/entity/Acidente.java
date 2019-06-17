package br.com.transitsur.entity;

import java.sql.Date;

public class Acidente {
	
	private Integer id;
	private Date DataAcontecimento;
	private String uf;
	private String BR;
	private String Latitude;
	private String Longitude;
	private String Horario;
	private String  CondicaoClimatica;
	private Integer IdTipoAcidente;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDataAcontecimento() {
		return DataAcontecimento;
	}
	public void setDataAcontecimento(Date dataAcontecimento) {
		DataAcontecimento = dataAcontecimento;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getBR() {
		return BR;
	}
	public void setBR(String bR) {
		BR = bR;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getHorario() {
		return Horario;
	}
	public void setHorario(String horario) {
		Horario = horario;
	}
	public String getCondicaoClimatica() {
		return CondicaoClimatica;
	}
	public void setCondicaoClimatica(String condicaoClimatica) {
		CondicaoClimatica = condicaoClimatica;
	}
	public Integer getIdTipoAcidente() {
		return IdTipoAcidente;
	}
	public void setIdTipoAcidente(Integer idTipoAcidente) {
		IdTipoAcidente = idTipoAcidente;
	}
}

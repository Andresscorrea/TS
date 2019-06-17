package br.com.transitsur.entity;

import java.sql.Date;

public class Acidente {
	
	int id;
	Date DataAcontecimento;
	String uf;
	String BR;
	String Latitude;
	String Longitude;
	String Horario;
	String CondicaoClimatica;
	int IdTipoAcidente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getIdTipoAcidente() {
		return IdTipoAcidente;
	}
	public void setIdTipoAcidente(int idTipoAcidente) {
		IdTipoAcidente = idTipoAcidente;
	}
	

}

package bootstrap.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="cliente")
public class Cliente {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=45)	
	private String rfc;
	
	@Column(length=45)
	private String nombre;
	@Column(length=45)
	private String calle;
	@Column(length=45)
	private String colonia;
	@Column(length=45)
	private String localidad;
	@Column(length=45)
	private String telefono;
	@Column(length=45)
	private String correo;
	
	public Cliente(String rfc,String nombre,String calle,String colonia,String localidad,String telefono, String correo   ){
		super();
		this.rfc=rfc;
		this.nombre=nombre;
		this.calle=calle;
		this.colonia=colonia;
		this.localidad=localidad;
		this.telefono=telefono;
		this.correo=correo;
	}
	
	public Cliente(){
		this("","","","","","","");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", rfc=" + rfc + ", nombre=" + nombre
				+ ", calle=" + calle + ", colonia=" + colonia + ", localidad="
				+ localidad + ", telefono=" + telefono + ", correo=" + correo
				+ "]";
	}
	

}

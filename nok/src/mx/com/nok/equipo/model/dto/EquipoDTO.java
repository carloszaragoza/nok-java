package mx.com.nok.equipo.model.dto;

import java.io.Serializable;

public class EquipoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String idEquipo;
	private String nombre;
	private String idMarcamotor;
	private String marcamotor;
	//private String idModelomotor;
	private String modelomotor;
	private String idMarca;
	private String marca;
	private String idSubmarca;
	private String submarca;
	private String idSubcategoria;
	private String subcategoria;
	private String idCategoria;
	private String categoria;
	private String idtipocategoria;
	private String tipocategoria;
	private String uso;
	private String numeroeconomico;
	private String descripcion;
	private String factura;
	private String pedimiento;
	private String permisofederal;
	private String cambioaceite;
	private String combustible;
	private String tipomedida;
	private String verificacion;
	private String fechaverificacion;
	private String tipoverificacion;
	private String tenencia;
	private String fechatenencia;
	private String tiporodaje;
	private String numerollantas;
	private String tipollanta;
	private String rin;
	private String numeroserie;
	private String hp;
	private String torque;
	private String peso;
	private String dimensioneslargo;
	private String dimensionesancho;
	private String dimensionesalto;
	private String dimaditamientolargo;
	private String dimaditamientoancho;
	private String dimaditamientoalto;
	private String anioequipo;
	private String capacidadcarga;
	private String numeroejes;
	private String numeromotor;
	private String numerochasis;
	private String numerocabina;
	private String kw;
	private String voltaje;
	private String amperes;
	private String capacidadpresion;
	private String tipomotor;
	private String cilindros;
	private String sizemotor;
	private String pica;
	private String golpesminuto;
	private String tipoadquisicion;
	private String fechaadquisicion;
	private String anioadquisicion;	
	private Boolean estatus;
	private String filterEstatusEquipo;
	
	//Propiedades de la imagen de la foto
	private String fotoequipo;
	private byte[] contentFoto;
	
	//Propiedades de la imagen de la factura
	private String fotofactura;
	private byte[] contentFactura;
	
	//Propiedades de la imagen de Pedimento
	private String fotopedimento;
	private byte[] contentPedimento;
	public String getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(String idEquipo) {
		this.idEquipo = idEquipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdMarcamotor() {
		return idMarcamotor;
	}
	public void setIdMarcamotor(String idMarcamotor) {
		this.idMarcamotor = idMarcamotor;
	}
	public String getMarcamotor() {
		return marcamotor;
	}
	public void setMarcamotor(String marcamotor) {
		this.marcamotor = marcamotor;
	}
	public String getModelomotor() {
		return modelomotor;
	}
	public void setModelomotor(String modelomotor) {
		this.modelomotor = modelomotor;
	}
	public String getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(String idMarca) {
		this.idMarca = idMarca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getIdSubmarca() {
		return idSubmarca;
	}
	public void setIdSubmarca(String idSubmarca) {
		this.idSubmarca = idSubmarca;
	}
	public String getSubmarca() {
		return submarca;
	}
	public void setSubmarca(String submarca) {
		this.submarca = submarca;
	}
	public String getIdSubcategoria() {
		return idSubcategoria;
	}
	public void setIdSubcategoria(String idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}
	public String getSubcategoria() {
		return subcategoria;
	}
	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getIdtipocategoria() {
		return idtipocategoria;
	}
	public void setIdtipocategoria(String idtipocategoria) {
		this.idtipocategoria = idtipocategoria;
	}
	public String getTipocategoria() {
		return tipocategoria;
	}
	public void setTipocategoria(String tipocategoria) {
		this.tipocategoria = tipocategoria;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	public String getNumeroeconomico() {
		return numeroeconomico;
	}
	public void setNumeroeconomico(String numeroeconomico) {
		this.numeroeconomico = numeroeconomico;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFactura() {
		return factura;
	}
	public void setFactura(String factura) {
		this.factura = factura;
	}
	public String getPedimiento() {
		return pedimiento;
	}
	public void setPedimiento(String pedimiento) {
		this.pedimiento = pedimiento;
	}
	public String getPermisofederal() {
		return permisofederal;
	}
	public void setPermisofederal(String permisofederal) {
		this.permisofederal = permisofederal;
	}
	public String getCambioaceite() {
		return cambioaceite;
	}
	public void setCambioaceite(String cambioaceite) {
		this.cambioaceite = cambioaceite;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public String getTipomedida() {
		return tipomedida;
	}
	public void setTipomedida(String tipomedida) {
		this.tipomedida = tipomedida;
	}
	public String getVerificacion() {
		return verificacion;
	}
	public void setVerificacion(String verificacion) {
		this.verificacion = verificacion;
	}
	public String getFechaverificacion() {
		return fechaverificacion;
	}
	public void setFechaverificacion(String fechaverificacion) {
		this.fechaverificacion = fechaverificacion;
	}
	public String getTipoverificacion() {
		return tipoverificacion;
	}
	public void setTipoverificacion(String tipoverificacion) {
		this.tipoverificacion = tipoverificacion;
	}
	public String getTenencia() {
		return tenencia;
	}
	public void setTenencia(String tenencia) {
		this.tenencia = tenencia;
	}
	public String getFechatenencia() {
		return fechatenencia;
	}
	public void setFechatenencia(String fechatenencia) {
		this.fechatenencia = fechatenencia;
	}
	public String getTiporodaje() {
		return tiporodaje;
	}
	public void setTiporodaje(String tiporodaje) {
		this.tiporodaje = tiporodaje;
	}
	public String getNumerollantas() {
		return numerollantas;
	}
	public void setNumerollantas(String numerollantas) {
		this.numerollantas = numerollantas;
	}
	public String getTipollanta() {
		return tipollanta;
	}
	public void setTipollanta(String tipollanta) {
		this.tipollanta = tipollanta;
	}
	public String getRin() {
		return rin;
	}
	public void setRin(String rin) {
		this.rin = rin;
	}
	public String getNumeroserie() {
		return numeroserie;
	}
	public void setNumeroserie(String numeroserie) {
		this.numeroserie = numeroserie;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getTorque() {
		return torque;
	}
	public void setTorque(String torque) {
		this.torque = torque;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getDimensioneslargo() {
		return dimensioneslargo;
	}
	public void setDimensioneslargo(String dimensioneslargo) {
		this.dimensioneslargo = dimensioneslargo;
	}
	public String getDimensionesancho() {
		return dimensionesancho;
	}
	public void setDimensionesancho(String dimensionesancho) {
		this.dimensionesancho = dimensionesancho;
	}
	public String getDimensionesalto() {
		return dimensionesalto;
	}
	public void setDimensionesalto(String dimensionesalto) {
		this.dimensionesalto = dimensionesalto;
	}
	public String getDimaditamientolargo() {
		return dimaditamientolargo;
	}
	public void setDimaditamientolargo(String dimaditamientolargo) {
		this.dimaditamientolargo = dimaditamientolargo;
	}
	public String getDimaditamientoancho() {
		return dimaditamientoancho;
	}
	public void setDimaditamientoancho(String dimaditamientoancho) {
		this.dimaditamientoancho = dimaditamientoancho;
	}
	public String getDimaditamientoalto() {
		return dimaditamientoalto;
	}
	public void setDimaditamientoalto(String dimaditamientoalto) {
		this.dimaditamientoalto = dimaditamientoalto;
	}
	public String getAnioequipo() {
		return anioequipo;
	}
	public void setAnioequipo(String anioequipo) {
		this.anioequipo = anioequipo;
	}
	public String getCapacidadcarga() {
		return capacidadcarga;
	}
	public void setCapacidadcarga(String capacidadcarga) {
		this.capacidadcarga = capacidadcarga;
	}
	public String getNumeroejes() {
		return numeroejes;
	}
	public void setNumeroejes(String numeroejes) {
		this.numeroejes = numeroejes;
	}
	public String getNumeromotor() {
		return numeromotor;
	}
	public void setNumeromotor(String numeromotor) {
		this.numeromotor = numeromotor;
	}
	public String getNumerochasis() {
		return numerochasis;
	}
	public void setNumerochasis(String numerochasis) {
		this.numerochasis = numerochasis;
	}
	public String getNumerocabina() {
		return numerocabina;
	}
	public void setNumerocabina(String numerocabina) {
		this.numerocabina = numerocabina;
	}
	public String getKw() {
		return kw;
	}
	public void setKw(String kw) {
		this.kw = kw;
	}
	public String getVoltaje() {
		return voltaje;
	}
	public void setVoltaje(String voltaje) {
		this.voltaje = voltaje;
	}
	public String getAmperes() {
		return amperes;
	}
	public void setAmperes(String amperes) {
		this.amperes = amperes;
	}
	public String getCapacidadpresion() {
		return capacidadpresion;
	}
	public void setCapacidadpresion(String capacidadpresion) {
		this.capacidadpresion = capacidadpresion;
	}
	public String getTipomotor() {
		return tipomotor;
	}
	public void setTipomotor(String tipomotor) {
		this.tipomotor = tipomotor;
	}
	public String getCilindros() {
		return cilindros;
	}
	public void setCilindros(String cilindros) {
		this.cilindros = cilindros;
	}
	public String getSizemotor() {
		return sizemotor;
	}
	public void setSizemotor(String sizemotor) {
		this.sizemotor = sizemotor;
	}
	public String getPica() {
		return pica;
	}
	public void setPica(String pica) {
		this.pica = pica;
	}
	public String getGolpesminuto() {
		return golpesminuto;
	}
	public void setGolpesminuto(String golpesminuto) {
		this.golpesminuto = golpesminuto;
	}
	public String getTipoadquisicion() {
		return tipoadquisicion;
	}
	public void setTipoadquisicion(String tipoadquisicion) {
		this.tipoadquisicion = tipoadquisicion;
	}
	public String getFechaadquisicion() {
		return fechaadquisicion;
	}
	public void setFechaadquisicion(String fechaadquisicion) {
		this.fechaadquisicion = fechaadquisicion;
	}
	public String getAnioadquisicion() {
		return anioadquisicion;
	}
	public void setAnioadquisicion(String anioadquisicion) {
		this.anioadquisicion = anioadquisicion;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
	
	public byte[] getContentFoto() {
		return contentFoto;
	}
	public void setContentFoto(byte[] contentFoto) {
		this.contentFoto = contentFoto;
	}
	
	public byte[] getContentFactura() {
		return contentFactura;
	}
	public void setContentFactura(byte[] contentFactura) {
		this.contentFactura = contentFactura;
	}
	
	public byte[] getContentPedimento() {
		return contentPedimento;
	}
	public void setContentPedimento(byte[] contentPedimento) {
		this.contentPedimento = contentPedimento;
	}
	public String getFilterEstatusEquipo() {
		return filterEstatusEquipo;
	}
	public void setFilterEstatusEquipo(String filterEstatusEquipo) {
		this.filterEstatusEquipo = filterEstatusEquipo;
	}
	public String getFotoequipo() {
		return fotoequipo;
	}
	public void setFotoequipo(String fotoequipo) {
		this.fotoequipo = fotoequipo;
	}
	public String getFotofactura() {
		return fotofactura;
	}
	public void setFotofactura(String fotofactura) {
		this.fotofactura = fotofactura;
	}
	public String getFotopedimento() {
		return fotopedimento;
	}
	public void setFotopedimento(String fotopedimento) {
		this.fotopedimento = fotopedimento;
	}
}

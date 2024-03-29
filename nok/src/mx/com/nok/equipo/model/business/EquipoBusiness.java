package mx.com.nok.equipo.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import mx.com.nok.equipo.dao.EquipoDAO;
import mx.com.nok.equipo.model.dto.EquipoDTO;
import mx.com.nok.equipo.model.dto.MarcaMotorDTO;
import mx.com.nok.equipo.model.service.EquipoService;
import mx.com.nok.menu.model.dto.MenuDTO;
import mx.com.nok.utils.FileUtils;

public class EquipoBusiness implements  Serializable, EquipoService{
	
	private EquipoDAO equipoDAO;
	private static final long serialVersionUID = 1L;
	
	public  List<?> infoEquipoAopSession(EquipoDTO dto) {
		List <?> list= new ArrayList<MenuDTO>();
		try {			
			
			list= equipoDAO.infoEquipo(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	private void cargarImagenes (EquipoDTO dto){
		
		if(dto.getFotoequipo().length() > 0){
			FileUtils.uploadFile(dto.getFotoequipo(), dto.getContentFoto(), 1);
		}
		if(dto.getFotofactura().length() > 0){
			FileUtils.uploadFile(dto.getFotofactura(), dto.getContentFactura(), 2);
		}
		if(dto.getFotopedimento().length() > 0){
			FileUtils.uploadFile(dto.getFotopedimento(), dto.getContentPedimento(), 3);
		}
		
	}
	
	public List<?> insertEquipoAopSession(EquipoDTO dto) {
		List <?> list = new ArrayList<>();
		try {
			
			cargarImagenes(dto);			
			
			list = equipoDAO.insertEquipo(dto);			
		} catch (Exception e) {			
			e.printStackTrace();
			list = null;
		}
		return list;
	}

	
	public EquipoDTO updateEquipoAopSession(EquipoDTO dto) {
		try {
			
			return equipoDAO.updateEquipo(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}


	
	public boolean deleteEquipoAopSession(EquipoDTO dto) {
		try {
			return (Boolean)equipoDAO.deleteEquipo(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
	
	public EquipoDTO updateEstatusEquipoAopSession(EquipoDTO dto){
		try {
			return equipoDAO.updateEstatusEquipo(dto);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//Metódo para obtener la lista de Marcas de Motor
	public List<?> infoMarcasMotorAopSession(MarcaMotorDTO dto) {
		List <?> list = new ArrayList<MarcaMotorDTO>();
		try{
			list = equipoDAO.infoMarcasMotor(dto);
		}catch (Exception e){
			e.printStackTrace();
			list = null;
		}
		return list;
	}


	public EquipoDAO getEquipoDAO() {
		return equipoDAO;
	}


	public void setEquipoDAO(EquipoDAO equipoDAO) {
		this.equipoDAO = equipoDAO;
	}

}

package mx.com.nok.requisicion.dao;

import java.util.List;

import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.requisicion.model.dto.RequisicionDTO;
import mx.com.nok.requisicion.model.dto.RequisicionDetalleDTO;

public interface RequisicionDAO {
	
	public List<?> infoRequisicion(RequisicionDTO dto) throws Exception;
	public RequisicionDTO insertRequisicion(RequisicionDTO dto)throws Exception;
	public RequisicionDTO updateRequisicion(RequisicionDTO dto) throws Exception;	
	public boolean deleteRequisicion(RequisicionDTO dto) throws Exception;
	
	
	public List<?> infoRequisicionDetalle(RequisicionDetalleDTO dto) throws Exception;
	public RequisicionDetalleDTO insertRequisicionDetalle(RequisicionDetalleDTO dto)throws Exception;
	public RequisicionDetalleDTO updateRequisicionDetalle(RequisicionDetalleDTO dto) throws Exception;	
	public boolean deleteRequisicionDetalle(RequisicionDetalleDTO dto) throws Exception;
}

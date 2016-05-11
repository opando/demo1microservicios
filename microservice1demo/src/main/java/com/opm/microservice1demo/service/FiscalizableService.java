package com.opm.microservice1demo.service;

import java.util.List;

import com.opm.microservice1demo.model.Auditor;
import com.opm.microservice1demo.model.Fiscalizable;


public interface FiscalizableService {

	public List<Fiscalizable> listaFiscalizable() ;
	
	public Fiscalizable obtenerFiscalizable(String idFiscalizable);
	
	public String actualizarFiscalizable(String idFiscalizable, Fiscalizable f) ;

	public String insertarFiscalizable(Fiscalizable f);

	public List<Auditor> listaAuditores();

	public int eliminarFiscalizable(String idFiscalizable);
}

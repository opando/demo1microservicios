package com.opm.microservice1demo.web.ws.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opm.microservice1demo.model.Auditor;
import com.opm.microservice1demo.service.FiscalizableService;



@RestController
public class AuditorRestController {



	@Autowired
	private FiscalizableService service;

	@RequestMapping(value = "/auditores", method = RequestMethod.GET)
	public List<Auditor> listaAuditores() {
		System.out.println("##### path : GET /auditoria/auditores");
		return service.listaAuditores();
	}

}

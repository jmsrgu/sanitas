package com.mycorp;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import util.datos.UsuarioAlta;

@RestController
@RequestMapping("/servlet/Zendesk")
public class ZendeskServRest {
	@Autowired
	private ZendeskService zendeskService;
	
	@RequestMapping(value = "/altaTicketZendesk", method = RequestMethod.GET)
    public String  altaTicket(@RequestParam(name = "usuarioAlta",required = true) UsuarioAlta usuarioAlta,
			@RequestParam(name = "userAgent",required = false) String userAgent) throws  IOException {

		return zendeskService.altaTicketZendesk(usuarioAlta, userAgent);
    }

}

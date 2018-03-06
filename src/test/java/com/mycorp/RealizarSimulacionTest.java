package com.mycorp;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.mycorp.repository.ValueCodeRepository;
import com.mycorp.support.ValueCode;



import junit.framework.TestCase;
import util.datos.UsuarioAlta;
/**
 * Unit test for simple App.
 */
public class RealizarSimulacionTest extends TestCase {
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	ValueCodeRepository valueCodeRepository;
	@LocalServerPort
    private int port;

	@Before
	public void cargaRepository() {
		ValueCode valueCode = new ValueCode();
		ValueCode valueCode2 = new ValueCode();
		valueCode.setCode("ABCD");
		valueCode.setValue("1");
		valueCode2.setCode("EFGH");
		valueCode2.setValue("2");
	
		valueCodeRepository.save(valueCode);
		
		
	}
	
    @Test
    public void testApp() throws Exception {

    	UsuarioAlta usuario = new UsuarioAlta();
    	String userAgent="juan";
   
       ResponseEntity<String> response = restTemplate.exchange("http://localhost:" + this.port + "/servlet/Zendesk/altaTicketZendesk?"+ "&usuarioAlta="
						+ usuario  + "&userAgent="+ userAgent ,HttpMethod.GET, null, new ParameterizedTypeReference<String>() {});
        
        
        
    }
    


}

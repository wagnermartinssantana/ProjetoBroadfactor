package br.com.projetobroadfactor.model;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;



public class ConsumirApiCnpj {
	
	
	@Test
	public void consumirAPI() {
	
	RestTemplate template = new RestTemplate();
	
	//https://receitaws.com.br/v1/cnpj/{CNPJ}
	
	UriComponents uri = UriComponentsBuilder.newInstance()
			.scheme("htps")
			.host("receitaws.com.br")
			.path("cnpj")
			.queryParam("fields", "all")
			.build();
			
	
	
	ResponseEntity<Usuario> entity = template.getForEntity(uri.toString(),Usuario.class);
		
		System.out.println(entity.getBody().getCnpj());
		
	}
}

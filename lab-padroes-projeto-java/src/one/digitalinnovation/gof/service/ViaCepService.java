package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.gof.model.Endereço;

/**
 * Client HTTP via <b>OpenFeign</b> para consumo da API <b>ViaCEP</b>.
 * 
 * @author amand
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public class ViaCepService {
	
	@GetMapping("/{cep}/json/")
	Endereco consulltarCep(@PathVariable("cep") String cep);
}

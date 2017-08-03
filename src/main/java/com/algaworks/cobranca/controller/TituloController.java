package com.algaworks.cobranca.controller;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.algaworks.cobranca.model.Titulo;

/**
 * 
 * @author ksa
 *
 */
@Controller
@RequestMapping("/titulo")
public class TituloController {

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo";
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(Titulo titulo) {
		System.out.println(">>>>>>>>>>>>>" + titulo.getDescricao()+ "" + titulo.getCodigo());
		
		// TODO: Salvar no banco de dados
		return "CadastroTitulo";
	}

}

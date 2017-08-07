package com.algaworks.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.cobranca.model.StatusTitulo;
import com.algaworks.cobranca.model.Titulo;
import com.algaworks.cobranca.repository.Titulos;

/**
 * 
 * @author ksa
 *
 */
@Controller
@RequestMapping("/titulos")
public class TituloController {

	@Autowired
	private Titulos titulos;

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mvNovo = new ModelAndView("CadastroTitulo");
		mvNovo.addObject("todosStatusTitulos", StatusTitulo.values());
		return mvNovo;
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo) {

		this.titulos.save(titulo);

		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("message", "Titulo Salvo com sucesso!");
		return mv;
	}

	@RequestMapping
	public String pesquisar() {
		return "PesquisaTitulos";
	}

}

package br.com.luciano.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Integer> clientes;
	
	public CadastroProdutoBean() {
		clientes = new ArrayList<>();
		for(int i = 0; i <= 20; i++) {
			clientes.add(i);
		}
	}

	public List<Integer> getClientes() {
		return clientes;
	}

}

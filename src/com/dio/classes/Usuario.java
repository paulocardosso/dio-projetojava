package com.dio.classes;

public class Usuario {
	private String login;
	private String senha;
	String nome;
	
	public Usuario(final String login, final String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	protected String getSenha() {
		return senha;
	}
}

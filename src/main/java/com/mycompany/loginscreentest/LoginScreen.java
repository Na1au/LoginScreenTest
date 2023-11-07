package com.mycompany.loginscreentest;

import java.util.HashMap;
import java.util.Map;
/**
 * Classe simples para autenticação do usuário, simulando um banco de dados de usuários
 * @author anala
 * @version 1.0 (07/11/2023)
 */
public class LoginScreen {
	private Map<String, String> userDatabase; // simula o baco de dados do usuário (username, password)
	
	/**
	 * Constroi uma nova instancia de LoginScreen e inicializa o banco de dados
	 * Para exemplificar, faz o pré-carregamento do banco de dados com usuários de exemplo.
	 */
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123"); // insere o usuário "john"
		userDatabase.put("alice", "securepass"); // insere o usuário "alice"
	}

	/**
	 * Faz a autenticação do usuário utilizando seu username e senha.
	 * @param username O nome inserido pelo usuário. 
	 * @param password A senha inserida pelo usuário.
	 * @return {@code true} se a autenticação ocorrer com sucesso, {@code false} se a autenticação falhar.
	 */
	public boolean login(String username, String password) {
		if(userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if(storedPassword.equals(password)) {
				return true;
			}
		}
		return false;
	}

	/**
	 *  Adiciona um novo usuário ao banco de dados.
	 * @param username O nome do novo usuário.
	 * @param password A senha do novo usuário.
	 */
	public void addUser(String username, String password) {
		userDatabase.put(username,  password);
		
	}

}
package com.example.Atividade.controler;

import model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientControler {

	@GetMapping("/cliente")
	public Client getClient() {
		Client client = new Client();
		client.setName("Diego Garcia Lopes");
		return client;
	}

	@GetMapping("/clientes")
	public ArrayList<Client> getClients() {
		Client client1 = new Client();
		Client client2 = new Client();
		client1.setName("Mario Silveira Martins");
		client2.setName("Paulo Souza Rodrigues");

		ArrayList<Client> clients = new ArrayList<>();
		clients.add(client1);
		clients.add(client2);

		return clients;
	}

}

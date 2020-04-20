package model;

/**
 * Descreve a Classe Client
 *
 * @author Harvey Braun
 * @version 1.0
 * @since 19/04/2020 - 15:00
 */
public class Client {

	private String name;

	public Client() {
	}

	public Client(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Client{" +
				"name='" + name + '\'' +
				'}';
	}
}

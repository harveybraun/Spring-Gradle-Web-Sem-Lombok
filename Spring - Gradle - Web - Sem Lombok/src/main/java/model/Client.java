package model;

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

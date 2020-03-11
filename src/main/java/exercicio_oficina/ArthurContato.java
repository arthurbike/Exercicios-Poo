package exercicio_oficina;

public class ArthurContato {
	private String telefone;
	private String email;

	public ArthurContato(String telefone, String email) {
		super();
		this.telefone = telefone;
		this.email = email;
	}

	public ArthurContato() {
		super();
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "telefone: " + telefone + "\n email: " + email;
	}

}

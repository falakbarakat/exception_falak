package se.lexicon.exceptions.workshop.data_access;

public class DuplicateNameException extends Exception {
	
	private String name;

	private static final long serialVersionUID = 1L;

	public DuplicateNameException(String name) {
		this.name=name;
	}

	public String getName() {
	
		return name;
	}

}

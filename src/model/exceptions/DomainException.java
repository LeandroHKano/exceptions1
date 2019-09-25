package model.exceptions;

/**
 * 
 * @author Leandro
 *
 * A classe Exception � executada na hora da compila��o e j� a RuntimeException � na hora da execu��o
 *
 */
public class DomainException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
	
}
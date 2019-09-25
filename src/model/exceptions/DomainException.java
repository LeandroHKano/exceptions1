package model.exceptions;

/**
 * 
 * @author Leandro
 *
 * A classe Exception é executada na hora da compilação e já a RuntimeException é na hora da execução
 *
 */
public class DomainException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
	
}
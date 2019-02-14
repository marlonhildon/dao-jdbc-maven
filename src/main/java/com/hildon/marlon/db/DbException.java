package com.hildon.marlon.db;

// Para o try-catch ser usado apenas quando o dev necessitar, estende-se RuntimeException; já
// que SQLException deriva de Exception, que é obrigatória de se solucionar.
public class DbException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DbException(String msg) {
		super(msg);
	}
}
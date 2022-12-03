package org.arca.intmetpriva;

public interface IntMetodoPriv {

	default void logInfo(String mensagem) {
		log(mensagem, "INFO");
	}
	
	default void logWarn(String mensagem) {
		log(mensagem, "WARN");
	}
	
	default void logError(String mensagem) {
		log(mensagem, "ERROR");
	}
	
	private void log(String mensagem, String tipo) {
		System.out.println("Inicio da Mesagem");
		
		System.out.println("Tipo: " + tipo+": " + mensagem );
		
		System.out.println("Fim da Mensagem");
	}
	
}

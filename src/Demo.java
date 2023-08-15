
public class Demo {
	
	public void accesoBD() throws ExceptionDAO {
		System.out.println("Estoy accediendo a la BD");
		
		try {
			throw new RuntimeException("Error de acceso a los datos");
		} catch(Exception e) {
			throw new ExceptionDAO("Error de acceso a los datos", e);
		}
	}

	public void negocios() throws ExceptionBO {
		System.out.println("Ejecutando politica de negocio");
		
		boolean failProcess = false;
		
		try {
			System.out.println("comienzo a armar grafico");
			this.accesoBD();
			System.out.println("finalizo grafico");
		} catch (ExceptionDAO e) {
			failProcess = true;
			System.out.println("No puedo obtener datos");
			throw new ExceptionBO("Error de negocio", e);
		} finally {
			if (failProcess)
				System.out.println("finalizo grafico con error");
		}
		
		System.out.println("Politica de negocio ejecutada");
		
	}
	
	public static void main(String[] args) {
		try {
			new Demo().negocios();
		} catch (ExceptionBO e) {
			System.out.println("Ocurrio una falla, lo resolveremos pronto");
		}
	}
}

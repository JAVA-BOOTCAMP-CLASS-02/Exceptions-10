
public class ExceptionBO extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6205884429847637885L;
	
	   public ExceptionBO() {
	        super();
	    }

	    public ExceptionBO(String message) {
	        super(message);
	    }

	    public ExceptionBO(String message, Throwable cause) {
	        super(message, cause);
	    }

	    public ExceptionBO(Throwable cause) {
	        super(cause);
	    }


}

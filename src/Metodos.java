
//final para que no se puede extender esta clase. Esto es ya que 
// es una clase estatica y no tiene sentido extenderla.
final public class Metodos {
	
	//Constructor privado porque no tiene sentido 
	//instanciar una clase estatica
	private Metodos(){ }
	
	public static boolean esVacio(String str){
		return str.trim().isEmpty();
	}
}

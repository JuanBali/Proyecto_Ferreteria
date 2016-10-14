
//final para que no se puede extender esta clase. Esto es ya que 
// es una clase estatica y no tiene sentido extenderla.
final public class Metodos {
	
	//Constructor privado porque no tiene sentido 
	//instanciar una clase estatica
	private Metodos(){ }
	
	//Devuelve 'true' si todos los caracteres del
	//string son espacios o esta vacio.
	public static boolean esVacio(String str){

		return str.isEmpty();
	
	}
	
	//Devuelve 'true' si hay un caracter ' '
	public static boolean tieneEspacio(String str){
		for(int i = 0; i < str.length(); ++i){
			if(str.charAt(i) == ' ') 
				return true;
		}
		return false;
	}
}

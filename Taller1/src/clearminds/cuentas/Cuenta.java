package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo="A";
	private double saldo;
	
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//creo constructores
	public  Cuenta(String id) {
		this.id=id;
	}
	public  Cuenta(String id,String tipo,double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	//Creo metodos
	public void imprimirConMiEstilo() {
		System.out.println("DATOS DE LA CUENTA");
		System.out.println("----------------------");
		System.out.println("Numero de cuenta:"+id);
		System.out.println("Tipo:"+tipo);
		System.out.println("Saldo:"+saldo);
		System.out.println("----------------------");
	}
	

}

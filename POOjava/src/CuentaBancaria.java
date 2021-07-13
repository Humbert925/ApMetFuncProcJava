
public class CuentaBancaria {
	
	//Atributos de la clase
	private String institucion = " ";
	private String beneficiario = " "; 
	private float saldo = 0 ; 
	private long cuenta = 0 ;
	private String pruducto = " "; 
	private String direccion = " ";
	private String RFC=""; 
	private String edoCta="";
	
	CuentaBancaria() {
		
	}
	
	//getter: obtener valor
	//set: escribir valor
	
	public String getInstitucion () {
		return this.institucion;
	}
	
	public void setInstitutucion (String institucion) {
		this.institucion =institucion;
	}
	
	
	
	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public float getSaldo(float saldo) {
		if (saldo>0) {
			this.saldo = saldo;
		} else {
			System.out.println("Cantidad inválida");
		}
		return saldo;
	}

	public void setSaldo(float saldo) {
		if (saldo>0) {
			this.saldo =saldo;
		}else {
			throw  new IllegalArgumentException("El saldo ingresado es inválido");
			//System.out.println ("Monto inválido");
		}
		this.saldo = saldo;
	}

	public long getCuenta() {
		return cuenta;
	}

	public void setCuenta(long cuenta) {
		this.cuenta = cuenta;
	}

	public String getPruducto() {
		return pruducto;
	}

	public void setPruducto(String pruducto) {
		this.pruducto = pruducto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	public String getEdoCta() {
		return edoCta;
	}

	public void setEdoCta(String edoCta) {
		this.edoCta = edoCta;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	CuentaBancaria(String beneficiario){
		this.beneficiario = beneficiario;
	}
	
	CuentaBancaria(String beneficiario, float saldo){
		this.beneficiario= beneficiario;
		this.saldo =saldo;
	}
	
	//métodos de clase -operaciones que realiza la clase-
	public void depositos(float monto) {
		this.saldo =this.saldo + monto;
	}
	
	public void retiros (float monto) {
		if (monto < this.saldo && monto > 0) {
			this.saldo = this.saldo - monto;
		}
	}
	
	public float consultarSaldo() {
		return this.saldo;
		}
	
	public String estadoDeCuenta() {
		return"";
		}
	

	
	
	
}

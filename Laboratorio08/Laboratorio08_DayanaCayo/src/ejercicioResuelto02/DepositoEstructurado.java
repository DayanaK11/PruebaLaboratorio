package ejercicioResuelto02;

public class DepositoEstructurado extends Deposito {
	//Atributos
	private double tipoInteresVariable;
	private double capitalVariable;
	
	//Constructores
	public DepositoEstructurado() {
		
	}

	public DepositoEstructurado(double tipoInteresVariable, double capitalVariable, Persona titular, double capital, int plazoDias, double tipoInteres) {
		super(titular, capital, plazoDias, tipoInteres);//llama constructor padre
		this.tipoInteresVariable = tipoInteresVariable;
		this.capitalVariable = capitalVariable;
	}
	
	//Metodos Getters and Setters
	public double getTipoInteresVariable() {
		return tipoInteresVariable;
	}

	public void setTipoInteresVariable(double tipoInteresVariable) {
		this.tipoInteresVariable = tipoInteresVariable;
	}

	public double getCapitalVariable() {
		return capitalVariable;
	}

	public void setCapitalVariable(double capitalVariable) {
		this.capitalVariable = capitalVariable;
	}
	
	//Metodos Publicos
	public double getInteresesVariables() {
		return (getPlazoDias() * tipoInteresVariable * capitalVariable)/365;
	}

	@Override
	public String toString() {
		StringBuilder sbCadena = new StringBuilder();
		sbCadena.append(super.toString()); //lamada a metodo clase padre
		sbCadena.append("\n Tipo de interes variable : " + tipoInteresVariable);
		sbCadena.append("\n Capital Variable : " + capitalVariable);
		sbCadena.append("\n Interes Variable  : " + getInteresesVariables() );
		return sbCadena.toString();
	}
	
	
	
	
}

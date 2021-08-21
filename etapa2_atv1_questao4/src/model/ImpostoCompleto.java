package model;

public class ImpostoCompleto implements ImpostoDeRenda{

	@Override
	public MetodoCalculo calcula() {
		// TODO Auto-generated method stub
		return new Completo();
	}

	
}

package model;

public class ImpostoSimplificado extends ImpostoDeRenda{

	@Override
	public MetodoCalculo calcula() {
		// TODO Auto-generated method stub
		return new Simplificado();
	}
	
	
}

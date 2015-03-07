class Retangulo{
	double altura;
	double base;
	
	public void calcula_area(){
		System.out.println ("Area = "+this.base*this.altura);
	}
	
	public void calcula_perimetro(){
		System.out.println ("Perimetro ="+(2*this.base+2*this.altura));
	}
}

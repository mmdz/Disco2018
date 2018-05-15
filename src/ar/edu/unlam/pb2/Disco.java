package ar.edu.unlam.pb2;

public class Disco {
	
	//Atributos
	private Double radioExterior;
	private Double radioInterior;
	
	//Constructor por Default
	public Disco(){
		
		
	}
	
	//Construtor con parametros
	public Disco(Double radioExterior, Double radioInterior){
		
		this.radioExterior = radioExterior ;
		this.radioInterior = radioInterior;

	}
	
	//Metodos
	public Double perimetroExterior(Double radioExterior, Double radioInterior){
	
		if(radioExterior>radioInterior){
			
			Double perimetroExt;
			perimetroExt = 2*Math.PI*radioExterior;
			//System.out.println(perimetroExt);
			return perimetroExt;
		
		}
		else{
			
			return 1.0;
		}

	}
	
	public Double perimetroInterior(Double radioExterior, Double radioInterior){
		
		if(radioExterior>radioInterior){
			
			Double perimetroInt = 2*Math.PI*radioInterior;
			//System.out.println(perimetroInt);
			return perimetroInt;
		}
		else{
			
			return 1.0;
			
		}
	}
	
	public Double superficie(Double radioExterior){
		
		if(this.radioExterior.equals(radioExterior)){
		
			Double superficie = Math.PI*Math.pow(radioExterior, 2);
			//System.out.println(superficie);
			return superficie;
		
		}
		else{
			
			//System.out.println("1.0");
			return 1.0;
			
		}
	}
	
	//Getters y Setters

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
	
}

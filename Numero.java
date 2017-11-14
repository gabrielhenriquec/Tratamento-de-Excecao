
public class Numero {
	int n1;
	int n2;
	
	Numero(){}
	
	public void validaNumeros()throws Exception{
		if (n1 <= 0){
			throw new Exception("O número 1 precisa ser maior que 0");
		}else if (n2 <= 0){
			throw new Exception("O número 2 precisa ser maior que 0");
		}
		
		
	}
	
	public double dividir(){
		return n1/n2;
	}

}

package Teste;

public class ClasseTeste {

	public ClasseTeste(){
		
	}
	
	public int somar(int a1, int a2){
		return a1 + a2;
	}
	
	public Object maior(int a1, int a2){
		if(a1 > a2){
			return a1;
		}else if(a2 > a1){
			return a2;
		}
		return null;
	}
	
	public int potencia(int a1, int a2){
		if(a2 == 0){
			return 1;
		}
			
		int k = a1;
		for (int i = 1; i < a2; i++) {
			k = k * a1;
		}
		return k;
	}
}

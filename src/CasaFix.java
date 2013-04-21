public class CasaFix {

	String cor;
	int totalDePortas;
	PortaFix[] portas;
	
	public void pinta(String s){
		this.cor = s;
	}
	
	public void quantasPortasEstaoAbertas(){
		int aberto = 0;
		int fechado = 0;
		
		for(int i = 0; i < this.portas.length; i++){
			if (portas[i].abertoFechado == "aberto"){
				aberto++;
			}else{
				fechado++;
			}
		}
		System.out.println("Abertas:"+aberto+"\nFechadas:"+fechado);
	}
	
	public void adicionaPorta (PortaFix p){
		for (int i = 0; i < this.portas.length; i++){
			if (portas[i] == null){
				portas[i] = p;
				return;
			}
		}
		
		PortaFix[] novasPortas = new PortaFix[this.portas.length + 1];
		for(int i = 0; i < this.portas.length; i++){
			novasPortas[i] = portas[i];
		}
		
		this.portas = novasPortas;
		
		this.adicionaPorta(p);
		
	}
	
	public int totalDePortas(){
		totalDePortas = this.portas.length;
		return totalDePortas;
	}

	public static void main(String[] args) {
		CasaFix casa = new CasaFix();
		casa.portas = new PortaFix[1];
		
		PortaFix porta01 = new PortaFix();
		porta01.abertoFechado = "aberto";
		casa.adicionaPorta(porta01);
		
		PortaFix porta02 = new PortaFix();
		porta02.abertoFechado = "fechado";
		casa.adicionaPorta(porta02);
		
		PortaFix porta03 = new PortaFix();
		porta03.abertoFechado = "fechado";
		casa.adicionaPorta(porta03);
		
		
		System.out.println(casa.totalDePortas() +" portas ao todo");
		
		
		casa.quantasPortasEstaoAbertas();
		
	}
	

}

class PortaFix{
	String abertoFechado;
}
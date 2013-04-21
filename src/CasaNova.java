public class CasaNova {

 
	String cor;
	int totalDePortas;
	PortaClass[] portas;
	
	
	
	
	public void pinta(String s){
		this.cor = s;
	}
	
	public void quantasPortasEstaoAbertas(){
		int totalAbertas = 0;
		int totalFechadas = 0;
	
		for (int x = 0; x < this.portas.length; x++){
			
			if (portas[x].statusDaPorta == "aberto"){
				totalAbertas++;
			}else{
				totalFechadas++;
			}
		}
		
		System.out.println("Total Abertas: "+totalAbertas+"\nTotal fechadas: "+totalFechadas);
		
	}
	
	public void adicionaPorta(PortaClass p){
		for (int x = 0; x < this.portas.length; x++){
			if (this.portas[x] == null ){
				portas[x] = p;
				return;
			}
		}
		
		PortaClass[] remanejaPortas = new PortaClass[this.portas.length + 1];
		for (int x = 0; x < this.portas.length; x++){
			remanejaPortas[x] = portas[x];
		} 
		
		this.portas = remanejaPortas;
		
		this.adicionaPorta(p);
		
	}
	
	public int totalDePortas(){
		totalDePortas = this.portas.length;
		return totalDePortas;
	}
	
	public static void main(String[] args) {
		
		CasaNova casa = new CasaNova();
		casa.portas = new PortaClass[1];
		
		PortaClass porta1 = new PortaClass();
		porta1.statusDaPorta = "aberto";
		casa.adicionaPorta(porta1);
		
		PortaClass porta2 = new PortaClass();
		porta2.statusDaPorta = "aberto";
		casa.adicionaPorta(porta2);
		
		PortaClass porta3 = new PortaClass();
		porta3.statusDaPorta = "fechado";
		casa.adicionaPorta(porta3);
		
		casa.pinta("amarelo");
		
		System.out.println("A cor da casa é: "+casa.cor);
		
		casa.quantasPortasEstaoAbertas();
		
		System.out.println("Portas ao todo: "+casa.totalDePortas());
		
	}

}

class PortaClass{
	String statusDaPorta;
}
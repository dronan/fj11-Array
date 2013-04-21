
public class Casa {

	String cor;
	int totalDePortas;
	Porta[] portas; // Criar uma classe Porta
	
	public void pinta(String s){
		this.cor = s;
	}
	
	public void quantasPortasEstaoAbertas(){
	
		int totalAbertas = 0;
		int totalFechadas = 0;
		
		for (int i = 0; i < this.portas.length; i++){ // Acessa a classe portas, declarada como array, e da o total de casas nela
			if (this.portas[i].abertaFechada == "aberta"){
				totalAbertas++;
			}else{
				totalFechadas++;
			}
		}
		System.out.println("Total de portas abertas: "+totalAbertas+"\nTotal de Portas fechadas: "+totalFechadas);
	}
	
	public void adicionaPorta (Porta p){
		for (int i = 0; i < this.portas.length; i++){
			if (portas[i] == null) {
				this.portas[i] = p;
				return;
			}
		}
		
		Porta[] arrayDePortas = new Porta[this.portas.length + 1];
		for (int i = 0; i < this.portas.length; i++){
			arrayDePortas[i] = portas[i];
		}
		
		this.portas = arrayDePortas;
		
		this.adicionaPorta(p);
		
	}
	
	public int totalDePortas(){
		totalDePortas = this.portas.length;
		//System.out.println(totalDePortas);
		return totalDePortas;
	}
	
	public void portasExibe(){
		int i = 0;
		for(Porta array : portas){
			System.out.println("Porta: "+i+" - "+array.abertaFechada);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		Casa casa = new Casa();
		casa.pinta("azul");
		System.out.println("Cor da casa: "+ casa.cor);
		
		casa.portas = new Porta[1];
		
		Porta porta1 = new Porta();
		porta1.abertaFechada = "aberta";
		casa.adicionaPorta(porta1);
		
		Porta porta2 = new Porta();
		porta2.abertaFechada = "fechada";
		casa.adicionaPorta(porta2);

		
		Porta porta3 = new Porta();
		porta3.abertaFechada = "fechada";
		casa.adicionaPorta(porta3);
		
		Porta porta4 = new Porta();
		porta4.abertaFechada = "fechada";
		casa.adicionaPorta(porta4);
		
		Porta porta5 = new Porta();
		porta5.abertaFechada = "fechada";
		casa.adicionaPorta(porta5);
		
		Porta porta6 = new Porta();
		porta6.abertaFechada = "fechada";
		casa.adicionaPorta(porta6);		
		
		System.out.println("Total de portas: "+casa.totalDePortas());
		casa.quantasPortasEstaoAbertas();
		
		
		casa.portasExibe();
		
	}
	

}

class Porta {
	String abertaFechada;
}



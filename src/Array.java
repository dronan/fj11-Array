 public class Array {
	public static void main (String[] args){
		/*
		int[] idades = new int[10];
		
		for (int i = 0; i < 10; i++){
			idades[i] = i * 10;
		}
		
		for (int i = 0; i < 10; i++){
			System.out.println(idades[i]);
		}
		
		int[][] arrayBidimensional = new int[10][10];
		arrayBidimensional[0][0] = 5;
		arrayBidimensional[0][1] = 2;
		arrayBidimensional[0][2] = 3;
		arrayBidimensional[0][4] = arrayBidimensional[0][2] * arrayBidimensional[0][0];
		
		System.out.println(arrayBidimensional[0][0]);
		
		System.out.println(arrayBidimensional[0][1]);
		
		System.out.println(arrayBidimensional[0][2]);
		
		System.out.println(arrayBidimensional[0][3]);
		
		System.out.println(arrayBidimensional[0][4]);
		*/
		
		int[][][] arrayTridimensional = new int[10][20][30];
		arrayTridimensional[0][0][0] = 1;
		arrayTridimensional[0][0][1] = 2;
		arrayTridimensional[0][0][2] = 3;
		arrayTridimensional[0][1][0] = 4;
		arrayTridimensional[0][1][2] = 5;
		
		System.out.println(arrayTridimensional[0][0][0]);
		System.out.println(arrayTridimensional[0][0][1]);
		System.out.println(arrayTridimensional[0][0][2]);
		System.out.println(arrayTridimensional[0][1][0]);
		System.out.println(arrayTridimensional[0][1][2]);
	
		

		
		int[][] arrayNaoRetangular = new int[10][]; // Definido o numero de linhas, mas não o de colunas
		arrayNaoRetangular[0] = new int[2]; // definimos o numero de colunas na linha 0
		arrayNaoRetangular[1] = new int[3]; // na linha 1
		arrayNaoRetangular[2] = new int[4]; // na linha 2
		arrayNaoRetangular[3] = new int[1]; // assim por diante... até a posição 10
		arrayNaoRetangular[4] = new int[5];
		
		
		int[] arrayTeste0 = new int[1]; 
		arrayTeste0[0] = 1;
		System.out.println(arrayTeste0[0]);
		
		
		String[] arrayDeStrings = {"teste1", "teste2", "teste3", "teste4", "teste5"};
		
		for(String array : arrayDeStrings){
			System.out.println(array);
		}
		
		System.out.println(arrayDeStrings[2]);
		
		for(String arrayArgs : args){
			System.out.println(arrayArgs);
		}
		
	}
	
	void imprimeArray (int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}

package Array;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4];
		
		notasAlunoA[0] = 6.5; 
		notasAlunoA[1] = 8; 
		notasAlunoA[2] = 6.7; 
		notasAlunoA[3] = 9.7; 
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
	
		System.out.printf("A média do aluno é %.1f\n", totalAlunoA / 4);
		
		double[] notasAlunoB = { 7.9, 8.9, 6.7, 9.7 };
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.printf("A média do aluno é %.1f", totalAlunoB / 4);
	}

}

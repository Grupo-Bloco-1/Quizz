
package quizz;

public class Principal {

	public static void main(String [] args) {
		
		Quizz quizz = new Quizz();
		
		quizz.adicionarPergunta(
				"Quanto � 2+2= ",
				"A) 2",
				"B) Carros",
				"C) Torres",
				"D) 7",
				1);
		
		quizz.adicionarPergunta(
				"Quanto � Agua?= ",
				"A) fogo",
				"B) Carros",
				"C) Torres",
				"D) 7",
				1);
		
		//quizz.exibirUltimaPergunta();
		
		quizz.listarPerguntas();
		quizz.exibirResultado();
	}
}
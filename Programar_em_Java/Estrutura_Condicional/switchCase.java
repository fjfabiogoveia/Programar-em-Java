package Estrutura_Condicional;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Swith case
		 * 
		 * � tamb�m um estrutura condicional
		 * Utilizamos quando h� muito If/Else encadeados
		 * Ele testa o valor contido de uma vari�vel.
		 * 
		 * 
		 * O switch/case testa o valor contido em uma vari�vel, realizando uma compara��o com cada uma das op��es. 
		 * Cada uma dessas poss�veis op��es � delimitada pela instru��o case.
		 * Podemos ter quantos casos de an�lise forem necess�rios e, quando um dos valores corresponder ao da vari�vel, 
		 * o c�digo do case correspondente ser� executado. Caso a vari�vel n�o corresponda a nenhum dos casos testados, 
		 * o �ltimo bloco ser� executado, chamado de default (padr�o).
		 * A an�lise de cada caso tamb�m precisa ter seu final delimitado. Essa delimita��o � feita atrav�s da palavra break.
		 * 
		 * */
		
		int mes = 2;
        switch (mes) {
            case 1:
                System.out.println("O m�s � de janeiro");
                break;
            case 2:
                System.out.println("O m�s � fevereiro");
                break;
            case 3:
                System.out.println("O m�s � mar�o");
                break;
            case 4:
                System.out.println("O m�s � abril");
                break;
            case 5:
                System.out.println("O m�s � maio");
                break;
            case 6:
                System.out.println("O m�s � junho");
                break;
            case 7:
                System.out.println("O m�s � julho");
                break;
            case 8:
                System.out.println("O m�s � agosto");
                break;
            case 9:
                System.out.println("O m�s � setembro");
                break;
            case 10:
                System.out.println("O m�s � outubro");
                break;
            case 11:
                System.out.println("O m�s � novembro");
                break;
            case 12:
                System.out.println("O m�s � dezembro");
                break;
            default:
                System.out.println("M�s inv�lido");
                break;
        
        }

	}

}

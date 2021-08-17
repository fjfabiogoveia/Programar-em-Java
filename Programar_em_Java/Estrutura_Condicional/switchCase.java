package Estrutura_Condicional;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Swith case
		 * 
		 * É também um estrutura condicional
		 * Utilizamos quando há muito If/Else encadeados
		 * Ele testa o valor contido de uma variável.
		 * 
		 * 
		 * O switch/case testa o valor contido em uma variável, realizando uma comparação com cada uma das opções. 
		 * Cada uma dessas possíveis opções é delimitada pela instrução case.
		 * Podemos ter quantos casos de análise forem necessários e, quando um dos valores corresponder ao da variável, 
		 * o código do case correspondente será executado. Caso a variável não corresponda a nenhum dos casos testados, 
		 * o último bloco será executado, chamado de default (padrão).
		 * A análise de cada caso também precisa ter seu final delimitado. Essa delimitação é feita através da palavra break.
		 * 
		 * */
		
		int mes = 2;
        switch (mes) {
            case 1:
                System.out.println("O mês é de janeiro");
                break;
            case 2:
                System.out.println("O mês é fevereiro");
                break;
            case 3:
                System.out.println("O mês é março");
                break;
            case 4:
                System.out.println("O mês é abril");
                break;
            case 5:
                System.out.println("O mês é maio");
                break;
            case 6:
                System.out.println("O mês é junho");
                break;
            case 7:
                System.out.println("O mês é julho");
                break;
            case 8:
                System.out.println("O mês é agosto");
                break;
            case 9:
                System.out.println("O mês é setembro");
                break;
            case 10:
                System.out.println("O mês é outubro");
                break;
            case 11:
                System.out.println("O mês é novembro");
                break;
            case 12:
                System.out.println("O mês é dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        
        }

	}

}

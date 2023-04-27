package br.com.alura.escola.aluno;

//VALUE OBJECT - SÃO CONSIDERADOS IGUAIS, SE TODOS OS OS SEUS ATRIBUTOS TIVEREM VALORES IGUAIS
public class CPF {

    private String numero;

    public CPF(String numero) {
        if (numero == null ||
                !numero.matches("/(\\d{3})(\\d{3})(\\d{3})(\\d{2})/")){
            throw new IllegalArgumentException("CPF inválido!");
        }
        this.numero = numero;
    }
}

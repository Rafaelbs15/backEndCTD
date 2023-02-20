public class Funcionario extends Vendedor{

    private Integer anosAntiguidade;
    private static List<afiliado> listaAfiliados = new ArrayList<>();
    public Funcionario(String nome, Integer Vendas, Integer potntosPorVenda, Integer anosAntiguidades) {
        super(nome, vendas, pontosPorVenda);
        this.anosAntiguidade = anosAntiguidade;

    }


    @Override
    public Integer calculaPontos() {

    }
}

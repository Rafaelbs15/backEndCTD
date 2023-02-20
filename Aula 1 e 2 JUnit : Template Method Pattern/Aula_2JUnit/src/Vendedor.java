public abstract class Vendedor {

    private String nome;
    private Integer vendas;

    private Integer pontosPorVendas;

    public Vendedor(String nome, Integer vendas, Integer pontosPorVenda) {
        this.nome = nome;
        this.vendas = vendas;
        this.pontosPorVenda = pontosPorVendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVendas() {
        return vendas;
    }

    public void setVendas(Integer vendas) {
        this.vendas = vendas;
    }

    public Integer getPontosPorVendas() {
        return pontosPorVendas;
    }

    public void setPontosPorVendas(Integer pontosPorVendas) {
        this.pontosPorVendas = pontosPorVendas;
    }

    public void vender(Integer qtdVends){
        this.vendas = this.vendas+qtdVenda;
        System.out.println("Vendedor: "+this.nome+ "Quantidade de Vendas: "+this.vendas);
    }
    public abstract Integer calculaPontos();
    public String getNomeCategoria(Integer Pontos){
        if(Pontos<20){
            System.out.println("Vendedor Novato");
        }else if(Pontos<=30){
            System.out.println();
        }
    }


}

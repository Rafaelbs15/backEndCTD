package IntegradorII;

public class SerieProxy implements ISerie{
    private Integer qtdViews=0;


    @Override
    public void getSerie(String nome) throws SerieNaoHabilitadaException {
        Serie s1 = new Serie();

            qtdViews++;
            if(qtdViews<=5){
                s1.getSerie(nome);
                System.out.println("Quantidade de séries assistidas: "+qtdViews);
            }else{
                throw new SerieNaoHabilitadaException();
            }



    }
}

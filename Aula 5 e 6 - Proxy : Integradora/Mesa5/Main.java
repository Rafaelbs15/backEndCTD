package IntegradorII;

public class Main {
    public static void main(String[] args) throws SerieNaoHabilitadaException {
        ISerie teste =  new SerieProxy();
        try{
            teste.getSerie("Friends");
            teste.getSerie("Friends");
            teste.getSerie("Friends");
            teste.getSerie("Friends");
            teste.getSerie("Friends");
            teste.getSerie("Friends");
        }catch (SerieNaoHabilitadaException e){
            System.out.println(e);
        }
    }
}

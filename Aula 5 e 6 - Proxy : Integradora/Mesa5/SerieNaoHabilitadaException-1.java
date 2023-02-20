package IntegradorII;

public class SerieNaoHabilitadaException extends Exception{

    public SerieNaoHabilitadaException(){
    super("Excede o número de reproduções permitidas!!!");
    }
}

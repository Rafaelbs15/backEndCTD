import java.time.LocalDate;

public class ServicoVacinar implements IVacinar {

    @Override
    public void vacinarPessoa(String rg, LocalDate dataVacina, String tipoVacina, LocalDate dataAgendada) {
        System.out.println("Usuario(a) com o RG:" + rg + ", foi vacinado(a) em:" + dataVacina + " com sucesso");
    }
}

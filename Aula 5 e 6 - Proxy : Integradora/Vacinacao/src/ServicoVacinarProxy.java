import java.time.LocalDate;

public class ServicoVacinarProxy implements IVacinar{

    @Override
    public void vacinarPessoa(String rg, LocalDate dataVacina, String tipoVacina, LocalDate dataAgendada) {
        if (dataVacina.isEqual(dataAgendada) || dataVacina.isAfter(dataAgendada)) {
            IVacinar vacinar = new ServicoVacinar();
            vacinar.vacinarPessoa(rg,dataVacina,tipoVacina,dataAgendada);
            System.out.println("Cidadão(ã) vacinado(a) com sucesso!");
        } else {
            System.out.println("A data de aplicacao(" + dataVacina + ") é anterior a data marcada(" + dataAgendada
            + "), por isso a vacina não pode ser aplicada!");
        }
    }
}

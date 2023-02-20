import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VacinaTest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Test
    @DisplayName("Deve vacinar")
    void vacinarNoMesmaDataDaDataMarcada(){
        LocalDate dataAplicacao = LocalDate.parse("16/02/2023", formatter);
        LocalDate dataMarcado = dataAplicacao;

        Pessoa p1 = new Pessoa("Jorge", "Lucas", "124567988", dataAplicacao, dataMarcado, "Pfizer");
        IVacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataAplicacao(), p1.getNomeVacina(), p1.getDataAgendada());
        System.out.println(p1.getNome() + " " + p1.getSobrenome() + ", portador do RG: " + p1.getRg() + ", foi vacinado com sucesso" +
                " no dia: " + p1.getDataAplicacao());
        System.out.println("------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Deve vacinar")
    void vacinarEmDataPosteriorADataMarcada(){
        LocalDate dataAplicacao = LocalDate.parse("16/02/2023", formatter);
        LocalDate dataMarcado = LocalDate.parse("10/02/2023", formatter);

        Pessoa p1 = new Pessoa("Maria", "Silva", "124567988", dataAplicacao, dataMarcado, "Pfizer");
        IVacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataAplicacao(), p1.getNomeVacina(), p1.getDataAgendada());
        System.out.println(p1.getNome() + " " + p1.getSobrenome() + ", portador do RG: " + p1.getRg() + ", foi vacinado com sucesso" +
                " no dia: " + p1.getDataAplicacao());
        System.out.println("------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Não deve vacinar")
    void vacinarEmDataAnteriorADataMarcada(){
        LocalDate dataAplicacao = LocalDate.parse("10/02/2023", formatter);
        LocalDate dataMarcado = LocalDate.parse("16/02/2023", formatter);

        Pessoa p1 = new Pessoa("Talia", "Moura", "124567988", dataAplicacao, dataMarcado, "Pfizer");
        IVacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataAplicacao(), p1.getNomeVacina(), p1.getDataAgendada());
        System.out.println("------------------------------------------------------------------------------");
    }

}

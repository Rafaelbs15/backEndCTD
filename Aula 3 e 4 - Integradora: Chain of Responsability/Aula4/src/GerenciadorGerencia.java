public class GerenciadorGerencia extends Gerenciador{

    @Override
    public void verificar(Mail mail) {
        if ((mail.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) ||
                (mail.getAssunto().equalsIgnoreCase("Gerência"))) {
            System.out.println("Enviado ao departamento gerenciaç");
        } else {
            if(this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(mail);
            }
        }
    }
}

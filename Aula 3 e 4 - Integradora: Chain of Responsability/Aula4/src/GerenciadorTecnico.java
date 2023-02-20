public class GerenciadorTecnico extends Gerenciador{

    @Override
    public void verificar(Mail mail) {
        if ((mail.getDestino().equalsIgnoreCase("tecnico@colmeia.com")) ||
                (mail.getAssunto().equalsIgnoreCase("Técnico"))) {
            System.out.println("Enviado ao departamento técnico");
        } else {
            if(this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(mail);
            }
        }
    }
}

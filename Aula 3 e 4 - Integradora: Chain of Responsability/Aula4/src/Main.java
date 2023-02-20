public class Main {
    public static void main(String[] args) {

        CheckMail precessa = new CheckMail();
        precessa.verificador(new Mail("email@email.com", "tecnica@digitalhouse.com", "Aula 4"));
        precessa.verificador(new Mail("email@email.com", "sds@digitalhouse.com", "Gerência"));
        precessa.verificador(new Mail("email@email.com", "assistencia@digitalhouse.com", "Comercial"));
        precessa.verificador(new Mail("email@email.com", "tecnico@colmeia.com", "Aula 4"));
    }
}
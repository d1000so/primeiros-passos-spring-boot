package dio.springboot.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreplay;

    @Autowired
    private Remetente teckTeam;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreplay);
        System.out.println("Seu cadastro foi aprovado");
    }
    public void enviarMensagemBoasVindas(){
        teckTeam.setEmail("tech@dio.com.br");
        System.out.println(teckTeam);
        System.out.println("Bem-vindo a Tech Elite");
    }
}

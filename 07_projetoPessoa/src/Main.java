import model.PessoaFisica;
import model.PessoaJuridica;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica(
                1L,
                "joao@email.com",
                "11999999999",
                "João Silva",
                LocalDate.of(1990, 5, 10),
                "12345678900"
        );

        PessoaJuridica pj = new PessoaJuridica(
                2L,
                "empresa@email.com",
                "1133334444",
                "Empresa LTDA",
                "Empresa X",
                "12345678000100"
        );

        System.out.println(pf.getNome());
        System.out.println(pj.getRazaoSocial());
    }
}
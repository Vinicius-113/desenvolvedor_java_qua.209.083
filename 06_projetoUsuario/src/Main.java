import model.Usuario;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                1,
                "Maria",
                new Date(),
                "maria@email.com",
                "1234"
        );

        String resultado = usuario.fazerLogin("maria@email.com", "1234");
        System.out.println(resultado);

        usuario.fazerLogoff();
    }
}
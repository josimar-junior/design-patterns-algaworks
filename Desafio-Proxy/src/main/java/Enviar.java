import com.jj.enviador.EnviadorEmailProxy;
import com.jj.model.EnviadorEmail;


public class Enviar {

	public static void main(String[] args) {
		EnviadorEmail enviador = new EnviadorEmailProxy("contatos_ativos.xml", "contatos_inativos.xml");
		enviador.enviar("Sejam bem vindos!");
	}
}

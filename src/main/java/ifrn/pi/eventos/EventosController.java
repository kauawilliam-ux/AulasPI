package ifrn.pi.eventos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}

	@RequestMapping("/eventos")
	public String adicionar() {
		return "Evento-adicionado";
		
	}
}

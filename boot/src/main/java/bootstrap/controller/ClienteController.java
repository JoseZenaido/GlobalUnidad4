package bootstrap.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bootstrap.model.Cliente;
import bootstrap.service.ClienteService;

@Controller
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/all-clientes")
	public String allCliente(HttpServletRequest request){
		request.setAttribute("clientes", clienteService.findAll());
		request.setAttribute("mode", "MODE_CLIENTES");
		return "cliente";
	}
	
	@GetMapping("/new-cliente")
	public String newCliente(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "cliente";
	}
	@PostMapping("/save-cliente")
	public String newCliente(@ModelAttribute Cliente cliente,BindingResult bindingResult,HttpServletRequest request){
		clienteService.save(cliente);
		request.setAttribute("clientes", clienteService.findAll());
		request.setAttribute("mode", "MODE_CLIENTES");
		return "cliente";
	}
	@GetMapping("/update-cliente")
	public String updateCliente(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("cliente", clienteService.findCliente(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "cliente";
	}
	@GetMapping("/delete-cliente")
	public String deleteCliente(@RequestParam int id,HttpServletRequest request){
		clienteService.delete(id);
		request.setAttribute("clientes", clienteService.findAll());
		request.setAttribute("mode", "MODE_CLIENTES");
		return "cliente";
	}
	
}

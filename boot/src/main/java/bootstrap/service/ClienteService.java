package bootstrap.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootstrap.dao.ClienteRepository;
import bootstrap.model.Cliente;

@Service @Transactional
public class ClienteService {
	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		super();
		this.clienteRepository = clienteRepository;
	}
	public List<Cliente> findAll(){
		List<Cliente> clientes = new ArrayList<Cliente>();
		for (Cliente cliente : clienteRepository.findAll()) {
			clientes.add(cliente);
		}
		return clientes;
	}
	
	public void save(Cliente cliente){
		clienteRepository.save(cliente);
	}
	
	public void delete(int id){
		clienteRepository.delete(id);
	}
	
	public Cliente findCliente(int id){
		return clienteRepository.findOne(id);
	}
}

	

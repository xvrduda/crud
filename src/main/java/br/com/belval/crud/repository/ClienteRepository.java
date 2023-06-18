package br.com.belval.crud.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import br.com.belval.crud.model.Cliente;



public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	
	  List<Cliente> findByNome(String nome);
	  List<Cliente> findByTelefone(String tefefone);
	  List<Cliente> findByCpf(String cpf);
	  List<Cliente> findByEndereco(String endereco);
	  List<Cliente> findByCidade(String cidade);
	  List<Cliente> findByBairro(String bairro);
	  List<Cliente> findByEmail(String email);

	  Cliente findById(int id);
	  
}
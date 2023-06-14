package br.com.belval.crud.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import br.com.belval.crud.model.Cliente;

public interface ProdutoRepository extends CrudRepository<Cliente, Integer> {
	
	  List<Cliente> findByDescricao(String descricao);

	  Cliente findById(int id);
}
package br.com.imarketplace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.imarketplace.entities.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	
	
}
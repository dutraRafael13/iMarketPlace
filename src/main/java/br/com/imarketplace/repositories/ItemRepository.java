package br.com.imarketplace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.imarketplace.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}

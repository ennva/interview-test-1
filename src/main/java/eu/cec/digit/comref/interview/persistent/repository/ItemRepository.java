package eu.cec.digit.comref.interview.persistent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.cec.digit.comref.interview.persistent.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}

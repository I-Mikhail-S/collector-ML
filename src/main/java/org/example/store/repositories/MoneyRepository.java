package org.example.store.repositories;

import org.example.store.model.Money;
import org.example.store.model.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyRepository extends JpaRepository<Money,Long> {

}

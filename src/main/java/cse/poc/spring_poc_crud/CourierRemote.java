package cse.poc.spring_poc_crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourierRemote extends JpaRepository<Courier,Integer> {
}

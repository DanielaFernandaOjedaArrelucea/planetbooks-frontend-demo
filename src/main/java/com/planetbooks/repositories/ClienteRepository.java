package com.planetbooks.repositories;

import com.planetbooks.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByActivoTrue();
    List<Cliente> findByActivoFalse();
}

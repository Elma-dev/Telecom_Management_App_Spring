package dev.elma.telecom_management_app_spring.repositories;

import dev.elma.telecom_management_app_spring.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

//@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Long> {

    Optional<Client> findByName(String name);
}

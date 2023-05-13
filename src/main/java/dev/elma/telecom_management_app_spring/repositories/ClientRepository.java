package dev.elma.telecom_management_app_spring.repositories;

import dev.elma.telecom_management_app_spring.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}

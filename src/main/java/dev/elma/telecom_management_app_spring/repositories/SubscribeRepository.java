package dev.elma.telecom_management_app_spring.repositories;

import dev.elma.telecom_management_app_spring.entities.Subscribe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
public interface SubscribeRepository extends JpaRepository<Subscribe,Long> {

}

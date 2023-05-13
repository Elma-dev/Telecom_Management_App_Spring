package dev.elma.telecom_management_app_spring.web;

import dev.elma.telecom_management_app_spring.entities.Client;
import dev.elma.telecom_management_app_spring.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class RestWebServices {
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> getAllClients(){
        return this.clientRepository.findAll();
    }
    @GetMapping("/{id}")
    public Client findClientById(@PathVariable(name = "id") long id){
        return this.clientRepository.findById(id).get();
    }

    @PostMapping("/add")
    public Client addClient(@RequestBody Client client){
        return this.clientRepository.save(client);
    }

    @GetMapping("/delete/{id}")
    public void deleteClient(@PathVariable(name = "id") long id){
        this.clientRepository.deleteById(id);
    }
}

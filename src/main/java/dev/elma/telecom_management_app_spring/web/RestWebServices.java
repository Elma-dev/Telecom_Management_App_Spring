package dev.elma.telecom_management_app_spring.web;

import dev.elma.telecom_management_app_spring.entities.Client;
import dev.elma.telecom_management_app_spring.entities.Subscribe;
import dev.elma.telecom_management_app_spring.repositories.ClientRepository;
import dev.elma.telecom_management_app_spring.repositories.SubscribeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/clients")
@AllArgsConstructor
public class RestWebServices {
    private ClientRepository clientRepository;
    private SubscribeRepository subscribeRepository;

    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return this.clientRepository.findAll();
    }
    @GetMapping("/clients/{id}")
    public Client findClientById(@PathVariable(name = "id") long id){
        return this.clientRepository.findById(id).get();
    }

    @PostMapping("/clients/add")
    public Client addClient(@RequestBody Client client){
        return this.clientRepository.save(client);
    }

    @DeleteMapping("/clients/delete/{id}")
    public void deleteClient(@PathVariable(name = "id") long id){
        this.clientRepository.deleteById(id);
    }

    @PutMapping("/clients/update/{id}")
    public Client updateClient(@PathVariable long id,@RequestBody Client client){
        Client client1 = this.clientRepository.findById(id).get();
        client1.setName(client.getName());
        client1.setEmail(client1.getEmail());
        client1.setUsername(client1.getUsername());
        return this.clientRepository.save(client1);
    }

    @GetMapping("/subscribers")
    public List<Subscribe> getAllSubscribers(){
        return subscribeRepository.findAll();
    }
    @GetMapping("/subscribers/{id}")
    public Subscribe getSubscribe(@PathVariable(name = "id") long id){
        return subscribeRepository.findById(id).get();
    }

    @PostMapping("/subscribers/add/{clientId}")
    public Subscribe addSubscribe(@PathVariable("clientId") long clientId,@RequestBody Subscribe subscribe){
        Client client = clientRepository.findById(clientId).get();
        subscribe.setClient(client);
        return subscribeRepository.save(subscribe);
    }

}

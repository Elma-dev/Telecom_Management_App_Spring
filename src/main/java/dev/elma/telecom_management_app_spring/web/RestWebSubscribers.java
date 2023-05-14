package dev.elma.telecom_management_app_spring.web;

import dev.elma.telecom_management_app_spring.entities.Client;
import dev.elma.telecom_management_app_spring.entities.Subscribe;
import dev.elma.telecom_management_app_spring.repositories.ClientRepository;
import dev.elma.telecom_management_app_spring.repositories.SubscribeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscribers")
@AllArgsConstructor
public class RestWebSubscribers {
    private SubscribeRepository subscribeRepository;
    private ClientRepository clientRepository;

    @GetMapping("/all")
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

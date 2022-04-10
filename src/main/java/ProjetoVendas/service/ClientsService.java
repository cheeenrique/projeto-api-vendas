package ProjetoVendas.service;

import ProjetoVendas.model.Client;
import ProjetoVendas.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//Service
public class ClientsService {

    @Autowired
    private ClientsRepository clientsRepository;

    public void saveClient(Client client){
        validatesClient(client);
        clientsRepository.save(client);
    }

    public void validatesClient(Client client){

    }
}

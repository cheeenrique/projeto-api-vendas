package br.com.projetovendas.domain.service;

import br.com.projetovendas.domain.entity.ClientEntity;
import br.com.projetovendas.domain.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity findEntityById(Integer id) {
        return clientRepository.getById(id);
    }

    public List<ClientEntity> findEntities() {
        return clientRepository.findAll();
    }

    public ClientEntity registerEntity(ClientEntity ClienteEntity) {
        return clientRepository.saveAndFlush(ClienteEntity);
    }

    public ClientEntity editEntity(ClientEntity ClienteEntity) {
        return clientRepository.save(ClienteEntity);
    }

    public ClientEntity deleteEntityById(Integer id){
        return clientRepository
                .findById(id)
                .map( client -> {
                    clientRepository.delete(client);
                    return client;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Cliente não encontrado") );
    }
}

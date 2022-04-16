package br.com.projetovendas.domain.controller;

import br.com.projetovendas.domain.entity.ClientEntity;
import br.com.projetovendas.domain.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/api-vendas/clientes/", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "{id}")
    public ResponseEntity<ClientEntity> findEntityById(@PathVariable Integer id){
        ClientEntity clientEntity = clientService.findEntityById(id);
        return Objects.nonNull(clientEntity) ? ResponseEntity.ok().body(clientEntity) : ResponseEntity.notFound().build();
    }

    @GetMapping(value = "/listar")
    public ResponseEntity<List<ClientEntity>> findEntities(){
        List<ClientEntity> clienteEntityList = clientService.findEntities();
        return Objects.nonNull(clienteEntityList) ? ResponseEntity.ok().body(clienteEntityList) : ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<ClientEntity> registerEntity(@RequestBody ClientEntity clientEntity){
        ClientEntity clientEntityRegister = clientService.registerEntity(clientEntity);
        return Objects.nonNull(clientEntityRegister) ? ResponseEntity.ok().body(clientEntityRegister) : ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/editar")
    public ResponseEntity<ClientEntity> editEntity(@RequestBody ClientEntity clientEntity){
        ClientEntity clientEntityEdit = clientService.editEntity(clientEntity);
        return Objects.nonNull(clientEntityEdit) ? ResponseEntity.ok().body(clientEntityEdit) : ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/deletar/{id}")
    public ResponseEntity<ClientEntity> deleteEntityById(@PathVariable Integer id){
        ClientEntity clientEntityDelete = clientService.deleteEntityById(id);
        return Objects.nonNull(clientEntityDelete) ? ResponseEntity.ok().body(clientEntityDelete) : ResponseEntity.noContent().build();
    }

}

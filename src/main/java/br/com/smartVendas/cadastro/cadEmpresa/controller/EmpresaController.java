package br.com.smartVendas.cadastro.cadEmpresa.controller;


import br.com.smartVendas.cadastro.cadEmpresa.models.Empresa;
import br.com.smartVendas.cadastro.cadEmpresa.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    //Salva empresa no banco de dados
    @PostMapping(value = "empresas")
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return this.empresaService.save(empresa);
    }

    //busca a lista das Empresas registradas
    @GetMapping(value = "/empresas")
    public List<Empresa> getAllEmpresas() {
        return this.empresaService.findAll();
    }

    //Deletar registro no banco de dados
    @DeleteMapping(value= "empresas/{id}")
    public void deleteEmpresa(@PathVariable Long id) {
        this.empresaService.delete(id);
    }

    //Busca empresa pelo id
    @GetMapping(value = "empresas/{id}")
    public Empresa getOne(@PathVariable Long id) {
        return this.empresaService.getOne(id);
    }

    //Atualiza registro ja criado no banco de dados
    @PutMapping(value = "empresas/{id}")
    public Empresa updateEmpresa(@RequestBody Empresa empresa,@PathVariable Long id){
        return this.empresaService.update(id, empresa);
    }
}




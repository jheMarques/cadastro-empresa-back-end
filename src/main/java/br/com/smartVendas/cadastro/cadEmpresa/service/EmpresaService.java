package br.com.smartVendas.cadastro.cadEmpresa.service;

import br.com.smartVendas.cadastro.cadEmpresa.models.Empresa;
import br.com.smartVendas.cadastro.cadEmpresa.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Empresa> findAll() {
        return  this.empresaRepository.findAll();
    }

    public Empresa save(Empresa empresa) {
        return this.empresaRepository.save(empresa);
    }

    public Empresa getOne(Long id) {
        return empresaRepository.findById(id).orElse( new Empresa());
    }

    public Empresa update(Long id, Empresa empresa) {
        Optional<Empresa> e=this.empresaRepository.findById(id);
        Empresa update=null;

        if (e.isPresent()){
            update=e.get();

            update.setCnpj(empresa.getCnpj());
            update.setNome(empresa.getNome());
            update.setCidade(empresa.getCidade());
            update.setEndereço(empresa.getEndereço());
            update.setTelefone(empresa.getTelefone());
            update.setEstado(empresa.getEstado());

            update=this.empresaRepository.save(update);
        }
        return update;
    }

    public void delete(Long id) {
        this.empresaRepository.deleteById(id);
    }
}

package br.com.smartVendas.cadastro.cadEmpresa.repository;

import br.com.smartVendas.cadastro.cadEmpresa.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}

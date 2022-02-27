package com.generation.farmacia.reposritory;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmacia.modal.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

	public List<Produto> findAllByNomeContainingIgnoreCaseAndLaboratorioContainingIgnoreCase(String nome,
			String laboratorio);

	public List<Produto> findAllByPrecoGreaterThanOrderByPreco(BigDecimal preco);

	public List<Produto> findAllByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);

	public List<Produto> findAllByPrecoBetweenOrderByPreco(BigDecimal preco1, BigDecimal preco2);

}


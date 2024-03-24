package br.com.alura.farmacia.service;

import br.com.alura.farmacia.dao.ConectionFactory;
import br.com.alura.farmacia.dao.ProdutoDAO;
import br.com.alura.farmacia.modelos.Produto;

import java.sql.Connection;
import java.util.List;


public class ProdutoService {

    private ConectionFactory connection;

    public ProdutoService(){
        this.connection = new ConectionFactory();
    }
    public void cadastrar(Produto produto){
        Connection conn = connection.recuperarConexao();
        new ProdutoDAO(conn).salvar(produto);

    }

    public List<Produto> listar(){
        Connection conn = connection.recuperarConexao();
        return new ProdutoDAO(conn).listar();
    }

    public void editarPreco(String nome, double valor){
        Connection conn = connection.recuperarConexao();
        new ProdutoDAO(conn).editarPreco(nome, valor);
    }

    public void deletar(String nome){
        Connection conn = connection.recuperarConexao();
        new ProdutoDAO(conn).deletar(nome);
    }
}

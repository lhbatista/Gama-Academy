package br.batista.loja.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="pedido")

public class Pedido {

    @Id //indica que é chave primária no BD
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera automatica e incremental o ID usando 1,2,3....em diante

    @Column(name = "numPedido")
    private int numPedido;

    @Column(name = "status")
    private  char status;

    @Column(name = "DataPedido")
    @Temporal(TemporalType.DATE)
    private Date dataPedido;

    @ManyToOne
    @JsonIgnoreProperties("pedidos") //não traga os pedidos desse solicitante
    private Usuario solicitante;

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }


    
    
}
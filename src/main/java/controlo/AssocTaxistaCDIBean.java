/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

import dao.AssocTaxistaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelo.AssocTaxista;

/**
 *
 * @author GENATCHI
 */
@Named(value = "assocTaxistaCDIBean")
@RequestScoped
public class AssocTaxistaCDIBean {

    AssocTaxista assocTaxista;
    AssocTaxistaDAO assocTaxistaDAO = new AssocTaxistaDAO();

    List<AssocTaxista> assocTaxistas;

    @PostConstruct
    public void inicizalizar() {
      assocTaxista = new AssocTaxista();
        assocTaxistas = new ArrayList<>();
        assocTaxistas = assocTaxistaDAO.listaTodosAssicTaxista();
        
    }

    public AssocTaxista getAssocTaxista() {
        return assocTaxista;
    }

    public void setAssocTaxista(AssocTaxista assocTaxista) {
        this.assocTaxista = assocTaxista;
    }

    public List<AssocTaxista> getAssocTaxistas() {
        return assocTaxistas;
    }

    public void setAssocTaxistas(List<AssocTaxista> assocTaxistas) {
        this.assocTaxistas = assocTaxistas;
    }

   

    // CRUD - Create , Read , Update , Delete
    public String guardar() {
        assocTaxistaDAO.save(assocTaxista);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String operacao = "Guardar";

        FacesMessage facesMessage
                = new FacesMessage(null, "Associado Guardado com sucesso" + " " + operacao);

        facesContext.addMessage(null, facesMessage);

        assocTaxista = new AssocTaxista();

        return "inserir-associadoT";
    }
//outro para salvar
    public String save() {
        assocTaxistaDAO.save(assocTaxista);
        assocTaxista = new AssocTaxista();
         return "inserir-associadoT";
    }

    public String editar() {
        assocTaxistaDAO.edit(assocTaxista);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String operacao = "Editar";

        FacesMessage facesMessage
                = new FacesMessage(null, " Dados do associado editados com sucesso" + " " + operacao);

        facesContext.addMessage(null, facesMessage);
        assocTaxista = new AssocTaxista();
        return "editar-associadoT";
    }

    public String prepararEditar() {

        return "editar-funcionario";
    }

    public String eliminar() {
        assocTaxistaDAO.delete(assocTaxista);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String operacao = "Eliminar";

        FacesMessage facesMessage
                = new FacesMessage(null, " Dados do associado eliminados com sucesso" + " " + operacao);

        facesContext.addMessage(null, facesMessage);

        return "lista-associadoT";
    }

    public String Cancelar(){
        
        return "lista-associadoT";
    }
    
    public List<AssocTaxista> getListaAssocTaxista() {
        List<AssocTaxista> lista = new ArrayList<>();
        lista = assocTaxistaDAO.listaTodosAssicTaxista();
        return lista;

    }


    
}

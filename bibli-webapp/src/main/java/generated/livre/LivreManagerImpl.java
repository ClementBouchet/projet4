
package generated.livre;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LivreManagerImpl", targetNamespace = "http://service.ocproject.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LivreManagerImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns generated.livre.Livre
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "emprunterLivre", targetNamespace = "http://service.ocproject.org/", className = "generated.livre.EmprunterLivre")
    @ResponseWrapper(localName = "emprunterLivreResponse", targetNamespace = "http://service.ocproject.org/", className = "generated.livre.EmprunterLivreResponse")
    @Action(input = "http://service.ocproject.org/LivreManagerImpl/emprunterLivreRequest", output = "http://service.ocproject.org/LivreManagerImpl/emprunterLivreResponse")
    public Livre emprunterLivre(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<generated.livre.Livre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "allBooks", targetNamespace = "http://service.ocproject.org/", className = "generated.livre.AllBooks")
    @ResponseWrapper(localName = "allBooksResponse", targetNamespace = "http://service.ocproject.org/", className = "generated.livre.AllBooksResponse")
    @Action(input = "http://service.ocproject.org/LivreManagerImpl/allBooksRequest", output = "http://service.ocproject.org/LivreManagerImpl/allBooksResponse")
    public List<Livre> allBooks();

    /**
     * 
     * @param arg0
     * @return
     *     returns generated.livre.Livre
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "detailLivre", targetNamespace = "http://service.ocproject.org/", className = "generated.livre.DetailLivre")
    @ResponseWrapper(localName = "detailLivreResponse", targetNamespace = "http://service.ocproject.org/", className = "generated.livre.DetailLivreResponse")
    @Action(input = "http://service.ocproject.org/LivreManagerImpl/detailLivreRequest", output = "http://service.ocproject.org/LivreManagerImpl/detailLivreResponse")
    public Livre detailLivre(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<generated.livre.Livre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "afficherResultat", targetNamespace = "http://service.ocproject.org/", className = "generated.livre.AfficherResultat")
    @ResponseWrapper(localName = "afficherResultatResponse", targetNamespace = "http://service.ocproject.org/", className = "generated.livre.AfficherResultatResponse")
    @Action(input = "http://service.ocproject.org/LivreManagerImpl/afficherResultatRequest", output = "http://service.ocproject.org/LivreManagerImpl/afficherResultatResponse")
    public List<Livre> afficherResultat(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
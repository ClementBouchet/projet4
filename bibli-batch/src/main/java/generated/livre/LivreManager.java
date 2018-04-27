
package generated.livre;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LivreManager", targetNamespace = "http://service.ocproject.org/", wsdlLocation = "http://lfr014449:8080/bibli-service-16660710278770111829.0-SNAPSHOT/LivreManager?wsdl")
public class LivreManager
    extends Service
{

    private final static URL LIVREMANAGER_WSDL_LOCATION;
    private final static WebServiceException LIVREMANAGER_EXCEPTION;
    private final static QName LIVREMANAGER_QNAME = new QName("http://service.ocproject.org/", "LivreManager");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://lfr014449:8080/bibli-service-16660710278770111829.0-SNAPSHOT/LivreManager?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LIVREMANAGER_WSDL_LOCATION = url;
        LIVREMANAGER_EXCEPTION = e;
    }

    public LivreManager() {
        super(__getWsdlLocation(), LIVREMANAGER_QNAME);
    }

    public LivreManager(WebServiceFeature... features) {
        super(__getWsdlLocation(), LIVREMANAGER_QNAME, features);
    }

    public LivreManager(URL wsdlLocation) {
        super(wsdlLocation, LIVREMANAGER_QNAME);
    }

    public LivreManager(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LIVREMANAGER_QNAME, features);
    }

    public LivreManager(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LivreManager(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LivreManagerImpl
     */
    @WebEndpoint(name = "LivreManagerImplPort")
    public LivreManagerImpl getLivreManagerImplPort() {
        return super.getPort(new QName("http://service.ocproject.org/", "LivreManagerImplPort"), LivreManagerImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LivreManagerImpl
     */
    @WebEndpoint(name = "LivreManagerImplPort")
    public LivreManagerImpl getLivreManagerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.ocproject.org/", "LivreManagerImplPort"), LivreManagerImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LIVREMANAGER_EXCEPTION!= null) {
            throw LIVREMANAGER_EXCEPTION;
        }
        return LIVREMANAGER_WSDL_LOCATION;
    }

}
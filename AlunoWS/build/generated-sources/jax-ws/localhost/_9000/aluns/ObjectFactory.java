
package localhost._9000.aluns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost._9000.aluns package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarResponse_QNAME = new QName("http://localhost:9000/aluns", "listarResponse");
    private final static QName _InserirResponse_QNAME = new QName("http://localhost:9000/aluns", "inserirResponse");
    private final static QName _Remover_QNAME = new QName("http://localhost:9000/aluns", "remover");
    private final static QName _RemoverResponse_QNAME = new QName("http://localhost:9000/aluns", "removerResponse");
    private final static QName _Alterar_QNAME = new QName("http://localhost:9000/aluns", "alterar");
    private final static QName _Inserir_QNAME = new QName("http://localhost:9000/aluns", "inserir");
    private final static QName _AlterarResponse_QNAME = new QName("http://localhost:9000/aluns", "alterarResponse");
    private final static QName _Listar_QNAME = new QName("http://localhost:9000/aluns", "listar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost._9000.aluns
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Inserir }
     * 
     */
    public Inserir createInserir() {
        return new Inserir();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link AlterarResponse }
     * 
     */
    public AlterarResponse createAlterarResponse() {
        return new AlterarResponse();
    }

    /**
     * Create an instance of {@link InserirResponse }
     * 
     */
    public InserirResponse createInserirResponse() {
        return new InserirResponse();
    }

    /**
     * Create an instance of {@link Remover }
     * 
     */
    public Remover createRemover() {
        return new Remover();
    }

    /**
     * Create an instance of {@link RemoverResponse }
     * 
     */
    public RemoverResponse createRemoverResponse() {
        return new RemoverResponse();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link Alterar }
     * 
     */
    public Alterar createAlterar() {
        return new Alterar();
    }

    /**
     * Create an instance of {@link Aluno }
     * 
     */
    public Aluno createAluno() {
        return new Aluno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:9000/aluns", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:9000/aluns", name = "inserirResponse")
    public JAXBElement<InserirResponse> createInserirResponse(InserirResponse value) {
        return new JAXBElement<InserirResponse>(_InserirResponse_QNAME, InserirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remover }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:9000/aluns", name = "remover")
    public JAXBElement<Remover> createRemover(Remover value) {
        return new JAXBElement<Remover>(_Remover_QNAME, Remover.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:9000/aluns", name = "removerResponse")
    public JAXBElement<RemoverResponse> createRemoverResponse(RemoverResponse value) {
        return new JAXBElement<RemoverResponse>(_RemoverResponse_QNAME, RemoverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Alterar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:9000/aluns", name = "alterar")
    public JAXBElement<Alterar> createAlterar(Alterar value) {
        return new JAXBElement<Alterar>(_Alterar_QNAME, Alterar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inserir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:9000/aluns", name = "inserir")
    public JAXBElement<Inserir> createInserir(Inserir value) {
        return new JAXBElement<Inserir>(_Inserir_QNAME, Inserir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:9000/aluns", name = "alterarResponse")
    public JAXBElement<AlterarResponse> createAlterarResponse(AlterarResponse value) {
        return new JAXBElement<AlterarResponse>(_AlterarResponse_QNAME, AlterarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:9000/aluns", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

}

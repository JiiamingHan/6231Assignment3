
package ClientFile;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ClientFile package. 
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

    private final static QName _CreateSRecordResponse_QNAME = new QName("http://ServerFile/", "createSRecordResponse");
    private final static QName _GetRecordCounts_QNAME = new QName("http://ServerFile/", "getRecordCounts");
    private final static QName _CreateSRecord_QNAME = new QName("http://ServerFile/", "createSRecord");
    private final static QName _EditRecord_QNAME = new QName("http://ServerFile/", "editRecord");
    private final static QName _GetRecordCountsResponse_QNAME = new QName("http://ServerFile/", "getRecordCountsResponse");
    private final static QName _EditRecordResponse_QNAME = new QName("http://ServerFile/", "editRecordResponse");
    private final static QName _CreateTRecordResponse_QNAME = new QName("http://ServerFile/", "createTRecordResponse");
    private final static QName _PrintRecordResponse_QNAME = new QName("http://ServerFile/", "printRecordResponse");
    private final static QName _CreateTRecord_QNAME = new QName("http://ServerFile/", "createTRecord");
    private final static QName _PrintRecord_QNAME = new QName("http://ServerFile/", "printRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ClientFile
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateSRecordResponse }
     * 
     */
    public CreateSRecordResponse createCreateSRecordResponse() {
        return new CreateSRecordResponse();
    }

    /**
     * Create an instance of {@link GetRecordCounts }
     * 
     */
    public GetRecordCounts createGetRecordCounts() {
        return new GetRecordCounts();
    }

    /**
     * Create an instance of {@link EditRecord }
     * 
     */
    public EditRecord createEditRecord() {
        return new EditRecord();
    }

    /**
     * Create an instance of {@link GetRecordCountsResponse }
     * 
     */
    public GetRecordCountsResponse createGetRecordCountsResponse() {
        return new GetRecordCountsResponse();
    }

    /**
     * Create an instance of {@link CreateSRecord }
     * 
     */
    public CreateSRecord createCreateSRecord() {
        return new CreateSRecord();
    }

    /**
     * Create an instance of {@link CreateTRecord }
     * 
     */
    public CreateTRecord createCreateTRecord() {
        return new CreateTRecord();
    }

    /**
     * Create an instance of {@link PrintRecord }
     * 
     */
    public PrintRecord createPrintRecord() {
        return new PrintRecord();
    }

    /**
     * Create an instance of {@link EditRecordResponse }
     * 
     */
    public EditRecordResponse createEditRecordResponse() {
        return new EditRecordResponse();
    }

    /**
     * Create an instance of {@link CreateTRecordResponse }
     * 
     */
    public CreateTRecordResponse createCreateTRecordResponse() {
        return new CreateTRecordResponse();
    }

    /**
     * Create an instance of {@link PrintRecordResponse }
     * 
     */
    public PrintRecordResponse createPrintRecordResponse() {
        return new PrintRecordResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerFile/", name = "createSRecordResponse")
    public JAXBElement<CreateSRecordResponse> createCreateSRecordResponse(CreateSRecordResponse value) {
        return new JAXBElement<CreateSRecordResponse>(_CreateSRecordResponse_QNAME, CreateSRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordCounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerFile/", name = "getRecordCounts")
    public JAXBElement<GetRecordCounts> createGetRecordCounts(GetRecordCounts value) {
        return new JAXBElement<GetRecordCounts>(_GetRecordCounts_QNAME, GetRecordCounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerFile/", name = "createSRecord")
    public JAXBElement<CreateSRecord> createCreateSRecord(CreateSRecord value) {
        return new JAXBElement<CreateSRecord>(_CreateSRecord_QNAME, CreateSRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerFile/", name = "editRecord")
    public JAXBElement<EditRecord> createEditRecord(EditRecord value) {
        return new JAXBElement<EditRecord>(_EditRecord_QNAME, EditRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordCountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerFile/", name = "getRecordCountsResponse")
    public JAXBElement<GetRecordCountsResponse> createGetRecordCountsResponse(GetRecordCountsResponse value) {
        return new JAXBElement<GetRecordCountsResponse>(_GetRecordCountsResponse_QNAME, GetRecordCountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerFile/", name = "editRecordResponse")
    public JAXBElement<EditRecordResponse> createEditRecordResponse(EditRecordResponse value) {
        return new JAXBElement<EditRecordResponse>(_EditRecordResponse_QNAME, EditRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerFile/", name = "createTRecordResponse")
    public JAXBElement<CreateTRecordResponse> createCreateTRecordResponse(CreateTRecordResponse value) {
        return new JAXBElement<CreateTRecordResponse>(_CreateTRecordResponse_QNAME, CreateTRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerFile/", name = "printRecordResponse")
    public JAXBElement<PrintRecordResponse> createPrintRecordResponse(PrintRecordResponse value) {
        return new JAXBElement<PrintRecordResponse>(_PrintRecordResponse_QNAME, PrintRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerFile/", name = "createTRecord")
    public JAXBElement<CreateTRecord> createCreateTRecord(CreateTRecord value) {
        return new JAXBElement<CreateTRecord>(_CreateTRecord_QNAME, CreateTRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerFile/", name = "printRecord")
    public JAXBElement<PrintRecord> createPrintRecord(PrintRecord value) {
        return new JAXBElement<PrintRecord>(_PrintRecord_QNAME, PrintRecord.class, null, value);
    }

}

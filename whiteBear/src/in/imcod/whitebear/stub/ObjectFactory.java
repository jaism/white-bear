//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.29 at 11:21:24 PM IST 
//


package in.imcod.whitebear.stub;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.imcod.whitebear.stub package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.imcod.whitebear.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link Entity.Fields }
     * 
     */
    public Entity.Fields createEntityFields() {
        return new Entity.Fields();
    }

    /**
     * Create an instance of {@link Entity.Fields.Field }
     * 
     */
    public Entity.Fields.Field createEntityFieldsField() {
        return new Entity.Fields.Field();
    }

    /**
     * Create an instance of {@link Entities }
     * 
     */
    public Entities createEntities() {
        return new Entities();
    }

    /**
     * Create an instance of {@link Entity.Fields.Field.Value }
     * 
     */
    public Entity.Fields.Field.Value createEntityFieldsFieldValue() {
        return new Entity.Fields.Field.Value();
    }

}

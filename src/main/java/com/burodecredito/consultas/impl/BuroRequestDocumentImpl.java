/*
 * An XML document type.
 * Localname: buroRequest
 * Namespace: http://burodecredito.com/consultas
 * Java type: com.burodecredito.consultas.BuroRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.burodecredito.consultas.impl;
/**
 * A document containing one buroRequest(@http://burodecredito.com/consultas) element.
 *
 * This is a complex type.
 */
public class BuroRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.burodecredito.consultas.BuroRequestDocument
{
    
    public BuroRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUROREQUEST$0 = 
        new javax.xml.namespace.QName("http://burodecredito.com/consultas", "buroRequest");
    
    
    /**
     * Gets the "buroRequest" element
     */
    public com.burodecredito.consultas.BuroRequestDocument.BuroRequest getBuroRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.burodecredito.consultas.BuroRequestDocument.BuroRequest target = null;
            target = (com.burodecredito.consultas.BuroRequestDocument.BuroRequest)get_store().find_element_user(BUROREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buroRequest" element
     */
    public void setBuroRequest(com.burodecredito.consultas.BuroRequestDocument.BuroRequest buroRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.burodecredito.consultas.BuroRequestDocument.BuroRequest target = null;
            target = (com.burodecredito.consultas.BuroRequestDocument.BuroRequest)get_store().find_element_user(BUROREQUEST$0, 0);
            if (target == null)
            {
                target = (com.burodecredito.consultas.BuroRequestDocument.BuroRequest)get_store().add_element_user(BUROREQUEST$0);
            }
            target.set(buroRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "buroRequest" element
     */
    public com.burodecredito.consultas.BuroRequestDocument.BuroRequest addNewBuroRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.burodecredito.consultas.BuroRequestDocument.BuroRequest target = null;
            target = (com.burodecredito.consultas.BuroRequestDocument.BuroRequest)get_store().add_element_user(BUROREQUEST$0);
            return target;
        }
    }
    /**
     * An XML buroRequest(@http://burodecredito.com/consultas).
     *
     * This is a complex type.
     */
    public static class BuroRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.burodecredito.consultas.BuroRequestDocument.BuroRequest
    {
        
        public BuroRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLIENTE$0 = 
            new javax.xml.namespace.QName("http://burodecredito.com/consultas", "cliente");
        private static final javax.xml.namespace.QName CREDITOS$2 = 
            new javax.xml.namespace.QName("http://burodecredito.com/consultas", "creditos");
        
        
        /**
         * Gets the "cliente" element
         */
        public org.fintech.data.Cliente getCliente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.fintech.data.Cliente target = null;
                target = (org.fintech.data.Cliente)get_store().find_element_user(CLIENTE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "cliente" element
         */
        public void setCliente(org.fintech.data.Cliente cliente)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.fintech.data.Cliente target = null;
                target = (org.fintech.data.Cliente)get_store().find_element_user(CLIENTE$0, 0);
                if (target == null)
                {
                    target = (org.fintech.data.Cliente)get_store().add_element_user(CLIENTE$0);
                }
                target.set(cliente);
            }
        }
        
        /**
         * Appends and returns a new empty "cliente" element
         */
        public org.fintech.data.Cliente addNewCliente()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.fintech.data.Cliente target = null;
                target = (org.fintech.data.Cliente)get_store().add_element_user(CLIENTE$0);
                return target;
            }
        }
        
        /**
         * Gets the "creditos" element
         */
        public int getCreditos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITOS$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "creditos" element
         */
        public org.apache.xmlbeans.XmlInt xgetCreditos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CREDITOS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "creditos" element
         */
        public void setCreditos(int creditos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDITOS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDITOS$2);
                }
                target.setIntValue(creditos);
            }
        }
        
        /**
         * Sets (as xml) the "creditos" element
         */
        public void xsetCreditos(org.apache.xmlbeans.XmlInt creditos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CREDITOS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CREDITOS$2);
                }
                target.set(creditos);
            }
        }
    }
}

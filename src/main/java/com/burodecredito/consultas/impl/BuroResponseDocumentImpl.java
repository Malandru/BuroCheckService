/*
 * An XML document type.
 * Localname: buroResponse
 * Namespace: http://burodecredito.com/consultas
 * Java type: com.burodecredito.consultas.BuroResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.burodecredito.consultas.impl;
/**
 * A document containing one buroResponse(@http://burodecredito.com/consultas) element.
 *
 * This is a complex type.
 */
public class BuroResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.burodecredito.consultas.BuroResponseDocument
{
    
    public BuroResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BURORESPONSE$0 = 
        new javax.xml.namespace.QName("http://burodecredito.com/consultas", "buroResponse");
    
    
    /**
     * Gets the "buroResponse" element
     */
    public com.burodecredito.consultas.BuroResponseDocument.BuroResponse getBuroResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.burodecredito.consultas.BuroResponseDocument.BuroResponse target = null;
            target = (com.burodecredito.consultas.BuroResponseDocument.BuroResponse)get_store().find_element_user(BURORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buroResponse" element
     */
    public void setBuroResponse(com.burodecredito.consultas.BuroResponseDocument.BuroResponse buroResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.burodecredito.consultas.BuroResponseDocument.BuroResponse target = null;
            target = (com.burodecredito.consultas.BuroResponseDocument.BuroResponse)get_store().find_element_user(BURORESPONSE$0, 0);
            if (target == null)
            {
                target = (com.burodecredito.consultas.BuroResponseDocument.BuroResponse)get_store().add_element_user(BURORESPONSE$0);
            }
            target.set(buroResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buroResponse" element
     */
    public com.burodecredito.consultas.BuroResponseDocument.BuroResponse addNewBuroResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.burodecredito.consultas.BuroResponseDocument.BuroResponse target = null;
            target = (com.burodecredito.consultas.BuroResponseDocument.BuroResponse)get_store().add_element_user(BURORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML buroResponse(@http://burodecredito.com/consultas).
     *
     * This is a complex type.
     */
    public static class BuroResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.burodecredito.consultas.BuroResponseDocument.BuroResponse
    {
        
        public BuroResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName APROBADO$0 = 
            new javax.xml.namespace.QName("http://burodecredito.com/consultas", "aprobado");
        private static final javax.xml.namespace.QName MOTIVO$2 = 
            new javax.xml.namespace.QName("http://burodecredito.com/consultas", "motivo");
        
        
        /**
         * Gets the "aprobado" element
         */
        public boolean getAprobado()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APROBADO$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "aprobado" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetAprobado()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(APROBADO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "aprobado" element
         */
        public void setAprobado(boolean aprobado)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APROBADO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APROBADO$0);
                }
                target.setBooleanValue(aprobado);
            }
        }
        
        /**
         * Sets (as xml) the "aprobado" element
         */
        public void xsetAprobado(org.apache.xmlbeans.XmlBoolean aprobado)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(APROBADO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(APROBADO$0);
                }
                target.set(aprobado);
            }
        }
        
        /**
         * Gets the "motivo" element
         */
        public java.lang.String getMotivo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOTIVO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "motivo" element
         */
        public org.apache.xmlbeans.XmlString xgetMotivo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOTIVO$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "motivo" element
         */
        public void setMotivo(java.lang.String motivo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOTIVO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOTIVO$2);
                }
                target.setStringValue(motivo);
            }
        }
        
        /**
         * Sets (as xml) the "motivo" element
         */
        public void xsetMotivo(org.apache.xmlbeans.XmlString motivo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOTIVO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOTIVO$2);
                }
                target.set(motivo);
            }
        }
    }
}

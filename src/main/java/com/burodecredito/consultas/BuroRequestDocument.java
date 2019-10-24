/*
 * An XML document type.
 * Localname: buroRequest
 * Namespace: http://burodecredito.com/consultas
 * Java type: com.burodecredito.consultas.BuroRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.burodecredito.consultas;


/**
 * A document containing one buroRequest(@http://burodecredito.com/consultas) element.
 *
 * This is a complex type.
 */
public interface BuroRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuroRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC94B8AEC748F7D94B221C90E6121E802").resolveHandle("burorequest85afdoctype");
    
    /**
     * Gets the "buroRequest" element
     */
    com.burodecredito.consultas.BuroRequestDocument.BuroRequest getBuroRequest();
    
    /**
     * Sets the "buroRequest" element
     */
    void setBuroRequest(com.burodecredito.consultas.BuroRequestDocument.BuroRequest buroRequest);
    
    /**
     * Appends and returns a new empty "buroRequest" element
     */
    com.burodecredito.consultas.BuroRequestDocument.BuroRequest addNewBuroRequest();
    
    /**
     * An XML buroRequest(@http://burodecredito.com/consultas).
     *
     * This is a complex type.
     */
    public interface BuroRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuroRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC94B8AEC748F7D94B221C90E6121E802").resolveHandle("burorequestd204elemtype");
        
        /**
         * Gets the "cliente" element
         */
        com.burodecredito.consultas.Cliente getCliente();
        
        /**
         * Sets the "cliente" element
         */
        void setCliente(com.burodecredito.consultas.Cliente cliente);
        
        /**
         * Appends and returns a new empty "cliente" element
         */
        com.burodecredito.consultas.Cliente addNewCliente();
        
        /**
         * Gets the "creditos" element
         */
        int getCreditos();
        
        /**
         * Gets (as xml) the "creditos" element
         */
        org.apache.xmlbeans.XmlInt xgetCreditos();
        
        /**
         * Sets the "creditos" element
         */
        void setCreditos(int creditos);
        
        /**
         * Sets (as xml) the "creditos" element
         */
        void xsetCreditos(org.apache.xmlbeans.XmlInt creditos);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.burodecredito.consultas.BuroRequestDocument.BuroRequest newInstance() {
              return (com.burodecredito.consultas.BuroRequestDocument.BuroRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.burodecredito.consultas.BuroRequestDocument.BuroRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.burodecredito.consultas.BuroRequestDocument.BuroRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.burodecredito.consultas.BuroRequestDocument newInstance() {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.burodecredito.consultas.BuroRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.burodecredito.consultas.BuroRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.burodecredito.consultas.BuroRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.burodecredito.consultas.BuroRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.burodecredito.consultas.BuroRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.burodecredito.consultas.BuroRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

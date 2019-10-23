/*
 * An XML document type.
 * Localname: buroResponse
 * Namespace: http://burodecredito.com/consultas
 * Java type: com.burodecredito.consultas.BuroResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.burodecredito.consultas;


/**
 * A document containing one buroResponse(@http://burodecredito.com/consultas) element.
 *
 * This is a complex type.
 */
public interface BuroResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuroResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5DB65761D83248CF676B4FDE483A3588").resolveHandle("buroresponsebe8bdoctype");
    
    /**
     * Gets the "buroResponse" element
     */
    com.burodecredito.consultas.BuroResponseDocument.BuroResponse getBuroResponse();
    
    /**
     * Sets the "buroResponse" element
     */
    void setBuroResponse(com.burodecredito.consultas.BuroResponseDocument.BuroResponse buroResponse);
    
    /**
     * Appends and returns a new empty "buroResponse" element
     */
    com.burodecredito.consultas.BuroResponseDocument.BuroResponse addNewBuroResponse();
    
    /**
     * An XML buroResponse(@http://burodecredito.com/consultas).
     *
     * This is a complex type.
     */
    public interface BuroResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuroResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5DB65761D83248CF676B4FDE483A3588").resolveHandle("buroresponsef018elemtype");
        
        /**
         * Gets the "aprobado" element
         */
        boolean getAprobado();
        
        /**
         * Gets (as xml) the "aprobado" element
         */
        org.apache.xmlbeans.XmlBoolean xgetAprobado();
        
        /**
         * Sets the "aprobado" element
         */
        void setAprobado(boolean aprobado);
        
        /**
         * Sets (as xml) the "aprobado" element
         */
        void xsetAprobado(org.apache.xmlbeans.XmlBoolean aprobado);
        
        /**
         * Gets the "motivo" element
         */
        java.lang.String getMotivo();
        
        /**
         * Gets (as xml) the "motivo" element
         */
        org.apache.xmlbeans.XmlString xgetMotivo();
        
        /**
         * Sets the "motivo" element
         */
        void setMotivo(java.lang.String motivo);
        
        /**
         * Sets (as xml) the "motivo" element
         */
        void xsetMotivo(org.apache.xmlbeans.XmlString motivo);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.burodecredito.consultas.BuroResponseDocument.BuroResponse newInstance() {
              return (com.burodecredito.consultas.BuroResponseDocument.BuroResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.burodecredito.consultas.BuroResponseDocument.BuroResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.burodecredito.consultas.BuroResponseDocument.BuroResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.burodecredito.consultas.BuroResponseDocument newInstance() {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.burodecredito.consultas.BuroResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.burodecredito.consultas.BuroResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.burodecredito.consultas.BuroResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.burodecredito.consultas.BuroResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.burodecredito.consultas.BuroResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.burodecredito.consultas.BuroResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

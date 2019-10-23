/*
 * XML Type:  credito
 * Namespace: http://fintech.org/data
 * Java type: org.fintech.data.Credito
 *
 * Automatically generated - do not modify.
 */
package org.fintech.data;


/**
 * An XML credito(@http://fintech.org/data).
 *
 * This is a complex type.
 */
public interface Credito extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Credito.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5DB65761D83248CF676B4FDE483A3588").resolveHandle("creditocf01type");
    
    /**
     * Gets the "cuenta" element
     */
    org.fintech.data.Cuenta getCuenta();
    
    /**
     * Sets the "cuenta" element
     */
    void setCuenta(org.fintech.data.Cuenta cuenta);
    
    /**
     * Appends and returns a new empty "cuenta" element
     */
    org.fintech.data.Cuenta addNewCuenta();
    
    /**
     * Gets the "monto" element
     */
    double getMonto();
    
    /**
     * Gets (as xml) the "monto" element
     */
    org.apache.xmlbeans.XmlDouble xgetMonto();
    
    /**
     * Sets the "monto" element
     */
    void setMonto(double monto);
    
    /**
     * Sets (as xml) the "monto" element
     */
    void xsetMonto(org.apache.xmlbeans.XmlDouble monto);
    
    /**
     * Gets the "interes" element
     */
    float getInteres();
    
    /**
     * Gets (as xml) the "interes" element
     */
    org.apache.xmlbeans.XmlFloat xgetInteres();
    
    /**
     * Sets the "interes" element
     */
    void setInteres(float interes);
    
    /**
     * Sets (as xml) the "interes" element
     */
    void xsetInteres(org.apache.xmlbeans.XmlFloat interes);
    
    /**
     * Gets the "plazo_meses" element
     */
    int getPlazoMeses();
    
    /**
     * Gets (as xml) the "plazo_meses" element
     */
    org.apache.xmlbeans.XmlInt xgetPlazoMeses();
    
    /**
     * Sets the "plazo_meses" element
     */
    void setPlazoMeses(int plazoMeses);
    
    /**
     * Sets (as xml) the "plazo_meses" element
     */
    void xsetPlazoMeses(org.apache.xmlbeans.XmlInt plazoMeses);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.fintech.data.Credito newInstance() {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.fintech.data.Credito newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.fintech.data.Credito parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.fintech.data.Credito parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.fintech.data.Credito parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.fintech.data.Credito parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.fintech.data.Credito parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.fintech.data.Credito parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.fintech.data.Credito parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.fintech.data.Credito parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.fintech.data.Credito parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.fintech.data.Credito parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.fintech.data.Credito parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.fintech.data.Credito parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.fintech.data.Credito parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.fintech.data.Credito parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.fintech.data.Credito parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.fintech.data.Credito parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.fintech.data.Credito) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

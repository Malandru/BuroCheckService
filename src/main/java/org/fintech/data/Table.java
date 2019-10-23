/*
 * XML Type:  table
 * Namespace: http://fintech.org/data
 * Java type: org.fintech.data.Table
 *
 * Automatically generated - do not modify.
 */
package org.fintech.data;


/**
 * An XML table(@http://fintech.org/data).
 *
 * This is a complex type.
 */
public interface Table extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Table.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5DB65761D83248CF676B4FDE483A3588").resolveHandle("tabledff9type");
    
    /**
     * Gets array of all "no_amortizacion" elements
     */
    int[] getNoAmortizacionArray();
    
    /**
     * Gets ith "no_amortizacion" element
     */
    int getNoAmortizacionArray(int i);
    
    /**
     * Gets (as xml) array of all "no_amortizacion" elements
     */
    org.apache.xmlbeans.XmlInt[] xgetNoAmortizacionArray();
    
    /**
     * Gets (as xml) ith "no_amortizacion" element
     */
    org.apache.xmlbeans.XmlInt xgetNoAmortizacionArray(int i);
    
    /**
     * Returns number of "no_amortizacion" element
     */
    int sizeOfNoAmortizacionArray();
    
    /**
     * Sets array of all "no_amortizacion" element
     */
    void setNoAmortizacionArray(int[] noAmortizacionArray);
    
    /**
     * Sets ith "no_amortizacion" element
     */
    void setNoAmortizacionArray(int i, int noAmortizacion);
    
    /**
     * Sets (as xml) array of all "no_amortizacion" element
     */
    void xsetNoAmortizacionArray(org.apache.xmlbeans.XmlInt[] noAmortizacionArray);
    
    /**
     * Sets (as xml) ith "no_amortizacion" element
     */
    void xsetNoAmortizacionArray(int i, org.apache.xmlbeans.XmlInt noAmortizacion);
    
    /**
     * Inserts the value as the ith "no_amortizacion" element
     */
    void insertNoAmortizacion(int i, int noAmortizacion);
    
    /**
     * Appends the value as the last "no_amortizacion" element
     */
    void addNoAmortizacion(int noAmortizacion);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "no_amortizacion" element
     */
    org.apache.xmlbeans.XmlInt insertNewNoAmortizacion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "no_amortizacion" element
     */
    org.apache.xmlbeans.XmlInt addNewNoAmortizacion();
    
    /**
     * Removes the ith "no_amortizacion" element
     */
    void removeNoAmortizacion(int i);
    
    /**
     * Gets array of all "capital" elements
     */
    double[] getCapitalArray();
    
    /**
     * Gets ith "capital" element
     */
    double getCapitalArray(int i);
    
    /**
     * Gets (as xml) array of all "capital" elements
     */
    org.apache.xmlbeans.XmlDouble[] xgetCapitalArray();
    
    /**
     * Gets (as xml) ith "capital" element
     */
    org.apache.xmlbeans.XmlDouble xgetCapitalArray(int i);
    
    /**
     * Returns number of "capital" element
     */
    int sizeOfCapitalArray();
    
    /**
     * Sets array of all "capital" element
     */
    void setCapitalArray(double[] capitalArray);
    
    /**
     * Sets ith "capital" element
     */
    void setCapitalArray(int i, double capital);
    
    /**
     * Sets (as xml) array of all "capital" element
     */
    void xsetCapitalArray(org.apache.xmlbeans.XmlDouble[] capitalArray);
    
    /**
     * Sets (as xml) ith "capital" element
     */
    void xsetCapitalArray(int i, org.apache.xmlbeans.XmlDouble capital);
    
    /**
     * Inserts the value as the ith "capital" element
     */
    void insertCapital(int i, double capital);
    
    /**
     * Appends the value as the last "capital" element
     */
    void addCapital(double capital);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "capital" element
     */
    org.apache.xmlbeans.XmlDouble insertNewCapital(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "capital" element
     */
    org.apache.xmlbeans.XmlDouble addNewCapital();
    
    /**
     * Removes the ith "capital" element
     */
    void removeCapital(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.fintech.data.Table newInstance() {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.fintech.data.Table newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.fintech.data.Table parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.fintech.data.Table parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.fintech.data.Table parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.fintech.data.Table parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.fintech.data.Table parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.fintech.data.Table parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.fintech.data.Table parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.fintech.data.Table parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.fintech.data.Table parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.fintech.data.Table parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.fintech.data.Table parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.fintech.data.Table parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.fintech.data.Table parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.fintech.data.Table parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.fintech.data.Table parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.fintech.data.Table parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.fintech.data.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

/*
 * XML Type:  table
 * Namespace: http://fintech.org/data
 * Java type: org.fintech.data.Table
 *
 * Automatically generated - do not modify.
 */
package org.fintech.data.impl;
/**
 * An XML table(@http://fintech.org/data).
 *
 * This is a complex type.
 */
public class TableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.fintech.data.Table
{
    
    public TableImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOAMORTIZACION$0 = 
        new javax.xml.namespace.QName("http://fintech.org/data", "no_amortizacion");
    private static final javax.xml.namespace.QName CAPITAL$2 = 
        new javax.xml.namespace.QName("http://fintech.org/data", "capital");
    
    
    /**
     * Gets array of all "no_amortizacion" elements
     */
    public int[] getNoAmortizacionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOAMORTIZACION$0, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "no_amortizacion" element
     */
    public int getNoAmortizacionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOAMORTIZACION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "no_amortizacion" elements
     */
    public org.apache.xmlbeans.XmlInt[] xgetNoAmortizacionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOAMORTIZACION$0, targetList);
            org.apache.xmlbeans.XmlInt[] result = new org.apache.xmlbeans.XmlInt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "no_amortizacion" element
     */
    public org.apache.xmlbeans.XmlInt xgetNoAmortizacionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NOAMORTIZACION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlInt)target;
        }
    }
    
    /**
     * Returns number of "no_amortizacion" element
     */
    public int sizeOfNoAmortizacionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOAMORTIZACION$0);
        }
    }
    
    /**
     * Sets array of all "no_amortizacion" element
     */
    public void setNoAmortizacionArray(int[] noAmortizacionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(noAmortizacionArray, NOAMORTIZACION$0);
        }
    }
    
    /**
     * Sets ith "no_amortizacion" element
     */
    public void setNoAmortizacionArray(int i, int noAmortizacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOAMORTIZACION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(noAmortizacion);
        }
    }
    
    /**
     * Sets (as xml) array of all "no_amortizacion" element
     */
    public void xsetNoAmortizacionArray(org.apache.xmlbeans.XmlInt[]noAmortizacionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(noAmortizacionArray, NOAMORTIZACION$0);
        }
    }
    
    /**
     * Sets (as xml) ith "no_amortizacion" element
     */
    public void xsetNoAmortizacionArray(int i, org.apache.xmlbeans.XmlInt noAmortizacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NOAMORTIZACION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(noAmortizacion);
        }
    }
    
    /**
     * Inserts the value as the ith "no_amortizacion" element
     */
    public void insertNoAmortizacion(int i, int noAmortizacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NOAMORTIZACION$0, i);
            target.setIntValue(noAmortizacion);
        }
    }
    
    /**
     * Appends the value as the last "no_amortizacion" element
     */
    public void addNoAmortizacion(int noAmortizacion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOAMORTIZACION$0);
            target.setIntValue(noAmortizacion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "no_amortizacion" element
     */
    public org.apache.xmlbeans.XmlInt insertNewNoAmortizacion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().insert_element_user(NOAMORTIZACION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "no_amortizacion" element
     */
    public org.apache.xmlbeans.XmlInt addNewNoAmortizacion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NOAMORTIZACION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "no_amortizacion" element
     */
    public void removeNoAmortizacion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOAMORTIZACION$0, i);
        }
    }
    
    /**
     * Gets array of all "capital" elements
     */
    public double[] getCapitalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAPITAL$2, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "capital" element
     */
    public double getCapitalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITAL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "capital" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetCapitalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAPITAL$2, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "capital" element
     */
    public org.apache.xmlbeans.XmlDouble xgetCapitalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(CAPITAL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Returns number of "capital" element
     */
    public int sizeOfCapitalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPITAL$2);
        }
    }
    
    /**
     * Sets array of all "capital" element
     */
    public void setCapitalArray(double[] capitalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(capitalArray, CAPITAL$2);
        }
    }
    
    /**
     * Sets ith "capital" element
     */
    public void setCapitalArray(int i, double capital)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITAL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(capital);
        }
    }
    
    /**
     * Sets (as xml) array of all "capital" element
     */
    public void xsetCapitalArray(org.apache.xmlbeans.XmlDouble[]capitalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(capitalArray, CAPITAL$2);
        }
    }
    
    /**
     * Sets (as xml) ith "capital" element
     */
    public void xsetCapitalArray(int i, org.apache.xmlbeans.XmlDouble capital)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(CAPITAL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(capital);
        }
    }
    
    /**
     * Inserts the value as the ith "capital" element
     */
    public void insertCapital(int i, double capital)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CAPITAL$2, i);
            target.setDoubleValue(capital);
        }
    }
    
    /**
     * Appends the value as the last "capital" element
     */
    public void addCapital(double capital)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPITAL$2);
            target.setDoubleValue(capital);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "capital" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewCapital(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(CAPITAL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "capital" element
     */
    public org.apache.xmlbeans.XmlDouble addNewCapital()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(CAPITAL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "capital" element
     */
    public void removeCapital(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPITAL$2, i);
        }
    }
}

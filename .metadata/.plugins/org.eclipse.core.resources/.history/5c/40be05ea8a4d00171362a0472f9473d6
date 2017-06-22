/**
 * ExtendedStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeditabServer;

public class ExtendedStatus  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String succeeded;

    private java.lang.String duplicate;

    private java.lang.String failed;

    public ExtendedStatus() {
    }

    public ExtendedStatus(
           java.lang.String status,
           java.lang.String succeeded,
           java.lang.String duplicate,
           java.lang.String failed) {
           this.status = status;
           this.succeeded = succeeded;
           this.duplicate = duplicate;
           this.failed = failed;
    }


    /**
     * Gets the status value for this ExtendedStatus.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ExtendedStatus.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the succeeded value for this ExtendedStatus.
     * 
     * @return succeeded
     */
    public java.lang.String getSucceeded() {
        return succeeded;
    }


    /**
     * Sets the succeeded value for this ExtendedStatus.
     * 
     * @param succeeded
     */
    public void setSucceeded(java.lang.String succeeded) {
        this.succeeded = succeeded;
    }


    /**
     * Gets the duplicate value for this ExtendedStatus.
     * 
     * @return duplicate
     */
    public java.lang.String getDuplicate() {
        return duplicate;
    }


    /**
     * Sets the duplicate value for this ExtendedStatus.
     * 
     * @param duplicate
     */
    public void setDuplicate(java.lang.String duplicate) {
        this.duplicate = duplicate;
    }


    /**
     * Gets the failed value for this ExtendedStatus.
     * 
     * @return failed
     */
    public java.lang.String getFailed() {
        return failed;
    }


    /**
     * Sets the failed value for this ExtendedStatus.
     * 
     * @param failed
     */
    public void setFailed(java.lang.String failed) {
        this.failed = failed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtendedStatus)) return false;
        ExtendedStatus other = (ExtendedStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.succeeded==null && other.getSucceeded()==null) || 
             (this.succeeded!=null &&
              this.succeeded.equals(other.getSucceeded()))) &&
            ((this.duplicate==null && other.getDuplicate()==null) || 
             (this.duplicate!=null &&
              this.duplicate.equals(other.getDuplicate()))) &&
            ((this.failed==null && other.getFailed()==null) || 
             (this.failed!=null &&
              this.failed.equals(other.getFailed())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSucceeded() != null) {
            _hashCode += getSucceeded().hashCode();
        }
        if (getDuplicate() != null) {
            _hashCode += getDuplicate().hashCode();
        }
        if (getFailed() != null) {
            _hashCode += getFailed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtendedStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeditabServer/", "ExtendedStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("succeeded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Succeeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duplicate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Failed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

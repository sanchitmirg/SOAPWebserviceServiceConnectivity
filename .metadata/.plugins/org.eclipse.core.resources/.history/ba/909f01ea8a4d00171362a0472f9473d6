/**
 * MeditabServer_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeditabServer;

public class MeditabServer_ServiceLocator extends org.apache.axis.client.Service implements localhost.MeditabServer.MeditabServer_Service {

    public MeditabServer_ServiceLocator() {
    }


    public MeditabServer_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MeditabServer_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MeditabServerSOAP
    private java.lang.String MeditabServerSOAP_address = "http://localhost/MeditabServer/services.php";

    public java.lang.String getMeditabServerSOAPAddress() {
        return MeditabServerSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MeditabServerSOAPWSDDServiceName = "MeditabServerSOAP";

    public java.lang.String getMeditabServerSOAPWSDDServiceName() {
        return MeditabServerSOAPWSDDServiceName;
    }

    public void setMeditabServerSOAPWSDDServiceName(java.lang.String name) {
        MeditabServerSOAPWSDDServiceName = name;
    }

    public localhost.MeditabServer.MeditabServer_PortType getMeditabServerSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MeditabServerSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMeditabServerSOAP(endpoint);
    }

    public localhost.MeditabServer.MeditabServer_PortType getMeditabServerSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.MeditabServer.MeditabServerSOAPStub _stub = new localhost.MeditabServer.MeditabServerSOAPStub(portAddress, this);
            _stub.setPortName(getMeditabServerSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMeditabServerSOAPEndpointAddress(java.lang.String address) {
        MeditabServerSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.MeditabServer.MeditabServer_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.MeditabServer.MeditabServerSOAPStub _stub = new localhost.MeditabServer.MeditabServerSOAPStub(new java.net.URL(MeditabServerSOAP_address), this);
                _stub.setPortName(getMeditabServerSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MeditabServerSOAP".equals(inputPortName)) {
            return getMeditabServerSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost/MeditabServer/", "MeditabServer");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost/MeditabServer/", "MeditabServerSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MeditabServerSOAP".equals(portName)) {
            setMeditabServerSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

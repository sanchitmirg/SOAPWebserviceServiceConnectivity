/**
 * MeditabServer_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeditabServer;

public interface MeditabServer_PortType extends java.rmi.Remote {
    public localhost.MeditabServer.OutMessage[] queryOutBoxMessages(java.lang.String meditabID, java.lang.String fromID, java.lang.String toID, java.lang.String messageID, java.lang.String relatedMessageID, java.lang.String meditabTranID, java.lang.String meditabTranIDFrom, java.lang.String meditabTranIDTo, java.lang.String MTxTranIDFrom, java.lang.String MTxTranIDTo, java.lang.String MTxRecordLimit, java.lang.String messageStatus, java.lang.String meditabResponseStatus, java.lang.String sentTimeFrom, java.lang.String sentTimeTo, java.lang.String smsVersion, java.lang.String appName, java.lang.String appVersion, java.lang.String vendorName) throws java.rmi.RemoteException;
    public java.lang.String sendToOutBox(localhost.MeditabServer.OutMessage[] in) throws java.rmi.RemoteException;
    public localhost.MeditabServer.InMessage[] queryInBoxMessages(java.lang.String toID, java.lang.String fromID, java.lang.String messageID, java.lang.String relatedMessageID, java.lang.String MTxTranIDFrom, java.lang.String MTxTranIDTo, java.lang.String MTxRecordLimit, java.lang.String messageStatus, java.lang.String meditabResponseStatus, java.lang.String smsVersion, java.lang.String appName, java.lang.String appVersion, java.lang.String vendorName, java.lang.String sentTimeFrom, java.lang.String sentTimeTo, java.lang.String receivedTimeFrom, java.lang.String receivedTimeTo) throws java.rmi.RemoteException;
    public java.lang.String sendToInBox(localhost.MeditabServer.InMessage[] in) throws java.rmi.RemoteException;
    public java.lang.String executeQuery(java.lang.String SQL, java.lang.String columnSeparator, java.lang.String lineSeparator) throws java.rmi.RemoteException;
    public localhost.MeditabServer.Pharmacy getPharmacy(java.lang.String NCPDPID) throws java.rmi.RemoteException;
    public localhost.MeditabServer.Prescriber getPrescriber(java.lang.String SPI) throws java.rmi.RemoteException;
    public localhost.MeditabServer.Pharmacy[] searchPharmacy(java.lang.String NCPDPID, java.lang.String pharmacyNumber, java.lang.String pharmacyName, java.lang.String phone, java.lang.String address, java.lang.String city, java.lang.String state, java.lang.String zip, java.lang.String serviceLevel, java.lang.String lastModifiedSinceDate) throws java.rmi.RemoteException;
    public localhost.MeditabServer.Prescriber[] searchPrescriber(java.lang.String SPI, java.lang.String DEA, java.lang.String lastName, java.lang.String firstName, java.lang.String clinicName, java.lang.String address, java.lang.String city, java.lang.String state, java.lang.String zip, java.lang.String phone, java.lang.String serviceLevel, java.lang.String lastModifiedSinceDate) throws java.rmi.RemoteException;
    public java.lang.String addPharmacy(localhost.MeditabServer.Pharmacy addPharmacy) throws java.rmi.RemoteException;
    public java.lang.String updatePharmacy(java.lang.String in) throws java.rmi.RemoteException;
    public java.lang.String addPrescriber(java.lang.String in) throws java.rmi.RemoteException;
    public java.lang.String updatePrescriber(java.lang.String in) throws java.rmi.RemoteException;
    public java.lang.String addPrescriberLocation(java.lang.String in) throws java.rmi.RemoteException;
    public java.lang.String markInBoxMessageAsRead(java.lang.String tranID) throws java.rmi.RemoteException;
    public java.lang.String markOutBoxMessageAsRead(java.lang.String meditabID, java.lang.String meditabTranID) throws java.rmi.RemoteException;
    public localhost.MeditabServer.OutMessageStatus[] queryOutBoxMessageStatus(java.lang.String meditabID, java.lang.String listOfFromID) throws java.rmi.RemoteException;
    public java.lang.String markOutBoxMessageStatusAsRead(java.lang.String tranID, java.lang.String missingTranID) throws java.rmi.RemoteException;
    public localhost.MeditabServer.ExtendedStatus sendToOutBoxWithVerify(localhost.MeditabServer.OutMessage[] in) throws java.rmi.RemoteException;
}

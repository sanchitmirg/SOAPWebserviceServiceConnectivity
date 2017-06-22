package localhost.MeditabServer;

public class MeditabServerProxy implements localhost.MeditabServer.MeditabServer_PortType {
  private String _endpoint = null;
  private localhost.MeditabServer.MeditabServer_PortType meditabServer_PortType = null;
  
  public MeditabServerProxy() {
    _initMeditabServerProxy();
  }
  
  public MeditabServerProxy(String endpoint) {
    _endpoint = endpoint;
    _initMeditabServerProxy();
  }
  
  private void _initMeditabServerProxy() {
    try {
      meditabServer_PortType = (new localhost.MeditabServer.MeditabServer_ServiceLocator()).getMeditabServerSOAP();
      if (meditabServer_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)meditabServer_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)meditabServer_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (meditabServer_PortType != null)
      ((javax.xml.rpc.Stub)meditabServer_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.MeditabServer.MeditabServer_PortType getMeditabServer_PortType() {
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType;
  }
  
  public localhost.MeditabServer.OutMessage[] queryOutBoxMessages(java.lang.String meditabID, java.lang.String fromID, java.lang.String toID, java.lang.String messageID, java.lang.String relatedMessageID, java.lang.String meditabTranID, java.lang.String meditabTranIDFrom, java.lang.String meditabTranIDTo, java.lang.String MTxTranIDFrom, java.lang.String MTxTranIDTo, java.lang.String MTxRecordLimit, java.lang.String messageStatus, java.lang.String meditabResponseStatus, java.lang.String sentTimeFrom, java.lang.String sentTimeTo, java.lang.String smsVersion, java.lang.String appName, java.lang.String appVersion, java.lang.String vendorName) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.queryOutBoxMessages(meditabID, fromID, toID, messageID, relatedMessageID, meditabTranID, meditabTranIDFrom, meditabTranIDTo, MTxTranIDFrom, MTxTranIDTo, MTxRecordLimit, messageStatus, meditabResponseStatus, sentTimeFrom, sentTimeTo, smsVersion, appName, appVersion, vendorName);
  }
  
  public java.lang.String sendToOutBox(localhost.MeditabServer.OutMessage[] in) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.sendToOutBox(in);
  }
  
  public localhost.MeditabServer.InMessage[] queryInBoxMessages(java.lang.String toID, java.lang.String fromID, java.lang.String messageID, java.lang.String relatedMessageID, java.lang.String MTxTranIDFrom, java.lang.String MTxTranIDTo, java.lang.String MTxRecordLimit, java.lang.String messageStatus, java.lang.String meditabResponseStatus, java.lang.String smsVersion, java.lang.String appName, java.lang.String appVersion, java.lang.String vendorName, java.lang.String sentTimeFrom, java.lang.String sentTimeTo, java.lang.String receivedTimeFrom, java.lang.String receivedTimeTo) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.queryInBoxMessages(toID, fromID, messageID, relatedMessageID, MTxTranIDFrom, MTxTranIDTo, MTxRecordLimit, messageStatus, meditabResponseStatus, smsVersion, appName, appVersion, vendorName, sentTimeFrom, sentTimeTo, receivedTimeFrom, receivedTimeTo);
  }
  
  public java.lang.String sendToInBox(localhost.MeditabServer.InMessage[] in) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.sendToInBox(in);
  }
  
  public java.lang.String executeQuery(java.lang.String SQL, java.lang.String columnSeparator, java.lang.String lineSeparator) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.executeQuery(SQL, columnSeparator, lineSeparator);
  }
  
  public localhost.MeditabServer.Pharmacy getPharmacy(java.lang.String NCPDPID) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.getPharmacy(NCPDPID);
  }
  
  public localhost.MeditabServer.Prescriber getPrescriber(java.lang.String SPI) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.getPrescriber(SPI);
  }
  
  public localhost.MeditabServer.Pharmacy[] searchPharmacy(java.lang.String NCPDPID, java.lang.String pharmacyNumber, java.lang.String pharmacyName, java.lang.String phone, java.lang.String address, java.lang.String city, java.lang.String state, java.lang.String zip, java.lang.String serviceLevel, java.lang.String lastModifiedSinceDate) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.searchPharmacy(NCPDPID, pharmacyNumber, pharmacyName, phone, address, city, state, zip, serviceLevel, lastModifiedSinceDate);
  }
  
  public localhost.MeditabServer.Prescriber[] searchPrescriber(java.lang.String SPI, java.lang.String DEA, java.lang.String lastName, java.lang.String firstName, java.lang.String clinicName, java.lang.String address, java.lang.String city, java.lang.String state, java.lang.String zip, java.lang.String phone, java.lang.String serviceLevel, java.lang.String lastModifiedSinceDate) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.searchPrescriber(SPI, DEA, lastName, firstName, clinicName, address, city, state, zip, phone, serviceLevel, lastModifiedSinceDate);
  }
  
  public java.lang.String addPharmacy(localhost.MeditabServer.Pharmacy addPharmacy) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.addPharmacy(addPharmacy);
  }
  
  public java.lang.String updatePharmacy(java.lang.String in) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.updatePharmacy(in);
  }
  
  public java.lang.String addPrescriber(java.lang.String in) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.addPrescriber(in);
  }
  
  public java.lang.String updatePrescriber(java.lang.String in) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.updatePrescriber(in);
  }
  
  public java.lang.String addPrescriberLocation(java.lang.String in) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.addPrescriberLocation(in);
  }
  
  public java.lang.String markInBoxMessageAsRead(java.lang.String tranID) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.markInBoxMessageAsRead(tranID);
  }
  
  public java.lang.String markOutBoxMessageAsRead(java.lang.String meditabID, java.lang.String meditabTranID) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.markOutBoxMessageAsRead(meditabID, meditabTranID);
  }
  
  public localhost.MeditabServer.OutMessageStatus[] queryOutBoxMessageStatus(java.lang.String meditabID, java.lang.String listOfFromID) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.queryOutBoxMessageStatus(meditabID, listOfFromID);
  }
  
  public java.lang.String markOutBoxMessageStatusAsRead(java.lang.String tranID, java.lang.String missingTranID) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.markOutBoxMessageStatusAsRead(tranID, missingTranID);
  }
  
  public localhost.MeditabServer.ExtendedStatus sendToOutBoxWithVerify(localhost.MeditabServer.OutMessage[] in) throws java.rmi.RemoteException{
    if (meditabServer_PortType == null)
      _initMeditabServerProxy();
    return meditabServer_PortType.sendToOutBoxWithVerify(in);
  }
  
  
}
package com.sanchit;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import localhost.MeditabServer.InMessage;
import localhost.MeditabServer.MeditabServerProxy;
import localhost.MeditabServer.MeditabServerSOAPStub;
import localhost.MeditabServer.MeditabServer_ServiceLocator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws AxisFault
    {
        MeditabServer_ServiceLocator locator = new MeditabServer_ServiceLocator();
		try {	
				
				String soapAddress = locator.getMeditabServerSOAPAddress();
				String soapName = locator.getMeditabServerSOAPWSDDServiceName();
				
				locator.setEndpointAddress(soapName, soapAddress);
				
		} catch (ServiceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		MeditabServerProxy proxy = new MeditabServerProxy();
		proxy.setEndpoint("https://srxsurescripts.meditab.com/xmlv2/services.php");
		
		//MeditabServerSOAPStub stub = new MeditabServerSOAPStub();
		
		try {
			InMessage[] message = proxy.queryInBoxMessages("5565657", "", "", "", "", "", "", "", "N", "", "", "", "", "", "", "", "");
			
			System.out.println(message.length);
			
			InMessage messageContent = message[message.length - 1];
			
			
			
			System.out.println(messageContent.getMessageID());
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

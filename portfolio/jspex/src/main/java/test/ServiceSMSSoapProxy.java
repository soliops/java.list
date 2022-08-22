package test;

import java.rmi.RemoteException;

public class ServiceSMSSoapProxy implements test.ServiceSMSSoap {
	private String _endpoint = null;
	private test.ServiceSMSSoap serviceSMSSoap = null;

	public ServiceSMSSoapProxy() {
	_initServiceSMSSoapProxy();
	}

	public ServiceSMSSoapProxy(String endpoint) {
	_endpoint = endpoint;
	_initServiceSMSSoapProxy();
	}

	private void _initServiceSMSSoapProxy() {
	try {
		serviceSMSSoap = (new test.ServiceSMSLocator()).getServiceSMSSoap();
		if (serviceSMSSoap != null) {
		if (_endpoint != null)
			((javax.xml.rpc.Stub)serviceSMSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
		else
			_endpoint = (String)((javax.xml.rpc.Stub)serviceSMSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
		}

	}
	catch (javax.xml.rpc.ServiceException serviceException) {}
	}

	public String getEndpoint() {
	return _endpoint;
	}

	public void setEndpoint(String endpoint) {
	_endpoint = endpoint;
	if (serviceSMSSoap != null)
		((javax.xml.rpc.Stub)serviceSMSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public test.ServiceSMSSoap getServiceSMSSoap() {
	if (serviceSMSSoap == null)
		_initServiceSMSSoapProxy();
	return serviceSMSSoap;
	}

	public java.lang.String sendSMS(java.lang.String smsID, java.lang.String hashValue, java.lang.String senderPhone, java.lang.String receivePhone, java.lang.String smsContent) throws java.rmi.RemoteException{
	if (serviceSMSSoap == null)
		_initServiceSMSSoapProxy();
	return serviceSMSSoap.sendSMS(smsID, hashValue, senderPhone, receivePhone, smsContent);
	}

	public java.lang.String sendSMSwnc(java.lang.String smsID, java.lang.String hashValue, java.lang.String gubun, java.lang.String senderPhone, java.lang.String receivePhone, java.lang.String smsContent) throws java.rmi.RemoteException{
	if (serviceSMSSoap == null)
		_initServiceSMSSoapProxy();
	return serviceSMSSoap.sendSMSwnc(smsID, hashValue, gubun, senderPhone, receivePhone, smsContent);
	}

	public java.lang.String sendSMSReserve(java.lang.String smsID, java.lang.String hashValue, java.lang.String senderPhone, java.lang.String receivePhone, java.lang.String smsContent, java.lang.String reserveDate, java.lang.String reserveTime, java.lang.String userDefine) throws java.rmi.RemoteException{
	if (serviceSMSSoap == null)
		_initServiceSMSSoapProxy();
	return serviceSMSSoap.sendSMSReserve(smsID, hashValue, senderPhone, receivePhone, smsContent, reserveDate, reserveTime, userDefine);
	}

	public int reserveCancle(java.lang.String smsID, java.lang.String hashValue, java.lang.String searchValue, java.lang.String mode) throws java.rmi.RemoteException{
	if (serviceSMSSoap == null)
		_initServiceSMSSoapProxy();
	return serviceSMSSoap.reserveCancle(smsID, hashValue, searchValue, mode);
	}

	public int getRemainCount(java.lang.String smsID, java.lang.String hashValue) throws java.rmi.RemoteException{
	if (serviceSMSSoap == null)
		_initServiceSMSSoapProxy();
	return serviceSMSSoap.getRemainCount(smsID, hashValue);
	}

	public String getRemainDay(java.lang.String smsID, java.lang.String hashValue) throws java.rmi.RemoteException{
	if (serviceSMSSoap == null)
		_initServiceSMSSoapProxy();
	return serviceSMSSoap.getRemainDay(smsID, hashValue);
	}

	@Override
	public String sendSMSCallBack(String smsID, String hashValue, String senderPhone, String receivePhone,
			String callbackUrl, String smsContent) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sendSMSCallBackReserve(String smsID, String hashValue, String senderPhone, String receivePhone,
			String callbackUrl, String smsContent, String reserveDate, String reserveTime, String userDefine)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
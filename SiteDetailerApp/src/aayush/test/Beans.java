/**
 * 
 */
package aayush.test;

import java.util.LinkedHashMap;

/**
 * @author aayush.n
 *
 */
public class Beans {
	
	private String name;
	
	private String ipAddress;
	private String security;
	private String protocol;
	private String host;
	private String port;
	private String query;
	private String reference;
	
	private LinkedHashMap<String,String>list=new LinkedHashMap<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @param ipAddress
	 * @param name
	 * @param security
	 */
	public Beans() {}
	/**
	 * @return the ipAddress
	 */
	
	public LinkedHashMap<String, String> getList() {
		return list;
	}
	public void setList(LinkedHashMap<String, String> list) {
		this.list = list;
	}
	
	public String getIpAddress() {
		return ipAddress;
	}
	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	/**
	 * @return the protocol
	 */
	public String getProtocol() {
		return protocol;
	}
	/**
	 * @param protocol the protocol to set
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}
	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}
	/**
	 * @return the port
	 */
	public String getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}
	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}
	/**
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}
	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}
	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	/**
	 * @return the security
	 */
	public String getSecurity() {
		return security;
	}
	/**
	 * @param security the security to set
	 */
	public void setSecurity(String security) {
		this.security = security;
	}
}

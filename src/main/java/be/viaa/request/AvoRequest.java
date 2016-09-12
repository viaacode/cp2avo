package be.viaa.request;

import java.io.Serializable;

public class AvoRequest implements Serializable {
	
	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cp name
	 */
	private String cpName;
	
	/**
	 * The flow id
	 */
	private String flowId;
	
	/**
	 * Host address of the FTP server
	 */
	private String server;
	
	/**
	 * Username used to log in to the FTP server
	 */
	private String username;
	
	/**
	 * Password used to log in to the FTP server
	 */
	private String password;
	
	/**
	 * Timestamp of the file
	 */
	private String timestamp;
	
	/**
	 * Collection of files in the package
	 */
	private File[] sipPackage;

	/**
	 * @return the cpName
	 */
	public String getCpName() {
		return cpName;
	}

	/**
	 * @param cpName the cpName to set
	 */
	public void setCpName(String cpName) {
		this.cpName = cpName;
	}

	/**
	 * @return the flowId
	 */
	public String getFlowId() {
		return flowId;
	}

	/**
	 * @param flowId the flowId to set
	 */
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	/**
	 * @return the server
	 */
	public String getServer() {
		return server;
	}

	/**
	 * @param server the server to set
	 */
	public void setServer(String server) {
		this.server = server;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the sipPackage
	 */
	public File[] getSipPackage() {
		return sipPackage;
	}

	/**
	 * @param sipPackage the sipPackage to set
	 */
	public void setSipPackage(File[] sipPackage) {
		this.sipPackage = sipPackage;
	}
	
}

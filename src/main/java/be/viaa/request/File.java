package be.viaa.request;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class File implements Serializable {

	/**
	 * The serial version uid
	 */
	private static final long serialVersionUID = 6959088623485902238L;

	/**
	 * Name of the file
	 */
	private String fileName;
	
	/**
	 * Path to the file
	 */
	private String filePath;
	
	/**
	 * The file type
	 */
	private String fileType;
	
	/**
	 * The checksum (md5) of the file
	 */
	private String checksum;
	
	/**
	 * The message's timestamp
	 */
	private String timestamp;
	
	/**
	 * The correlation id
	 */
	private String correlationId;

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * @return the fileType
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * @param fileType the fileType to set
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	/**
	 * @return the checksum
	 */
	public String getChecksum() {
		return checksum;
	}

	/**
	 * @param checksum the checksum to set
	 */
	public void setChecksum(String checksum) {
		this.checksum = checksum;
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
	 * @return the correlationId
	 */
	public String getCorrelationId() {
		return correlationId;
	}

	/**
	 * @param correlationId the correlationId to set
	 */
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	
}

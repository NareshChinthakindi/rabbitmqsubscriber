/**
 * 
 */
package org.naresh.javariders;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Naresh
 *
 */
public class PublisherRequest implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String metaData = "Naresh Test";
    private String uuid = UUID.randomUUID().toString();
	private byte[] body = null;
	private String fileName = null;
	
	
	public String getMetaData() {
		return metaData;
	}
	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public byte[] getBody() {
		return body;
	}
	public void setBody(byte[] body) {
		this.body = body;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}

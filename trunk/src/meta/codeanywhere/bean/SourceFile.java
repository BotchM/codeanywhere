/**
 * 
 */
package meta.codeanywhere.bean;

import java.sql.Blob;
import java.sql.SQLException;

import org.hibernate.Hibernate;

/**
 * @author Biao Zhang
 * @version 11/17/2006
 */
public class SourceFile {
	private Integer id;
	private User owner = null;
	private String fileName = null;
	private Blob source = null;
	
	public SourceFile() {

	}

	public SourceFile(int id, User owner, String fileName, String text) {
		super();
		this.id = id;
		this.owner = owner;
		this.fileName = fileName;
		this.source = Hibernate.createBlob(text.getBytes());
	}

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id Ҫ���õ� id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return owner
	 */
	public User getOwner() {
		return owner;
	}

	/**
	 * @return fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName Ҫ���õ� fileName
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @param owner Ҫ���õ� owner
	 */
	public void setOwner(User owner) {
		this.owner = owner;
	}

	/**
	 * @return source
	 */
	public Blob getSource() {
		return source;
	}

	/**
	 * @param source Ҫ���õ� source
	 */
	public void setSource(Blob source) {
		this.source = source;
	}
	
	public void setStringData(String text) {
		source = Hibernate.createBlob(text.getBytes());
	}
	
	public String getSourceText() throws SQLException {
		String s = new String(source.getBytes(1, (int) source.length()));
		return s;
	}
	
	public void save() {
		
	}
}

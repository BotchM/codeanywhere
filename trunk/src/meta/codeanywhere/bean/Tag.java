/**
 * 
 */
package meta.codeanywhere.bean;

/**
 * @author Biao Zhang
 *
 */
public class Tag {
	private Integer id;
	private String tag;
	private SourceFile file;
	
	public Tag() {
	}

	public Tag(int id, String tag, SourceFile file) {
		this.id = id;
		this.tag = tag;
		this.file = file;
	}

	/**
	 * @return file
	 */
	public SourceFile getFile() {
		return file;
	}

	/**
	 * @param file Ҫ���õ� file
	 */
	public void setFile(SourceFile file) {
		this.file = file;
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
	 * @return tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag Ҫ���õ� tag
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	
}

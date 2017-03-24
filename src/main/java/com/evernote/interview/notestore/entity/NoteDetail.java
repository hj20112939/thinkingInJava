package com.evernote.interview.notestore.entity;
/**
 * 
 * @author user
 * 笔记信息实体类
 */
public class NoteDetail {
	private String guid;
	private String title;
	private String content;
	private String contentLength;
	/**
	 * 获取笔记唯一表示符
	 * @return the guid
	 */
	public String getGuid() {
		return guid;
	}
	/**
	 * @param guid the guid to set
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}
	/**
	 * 获取笔记标题
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取笔记内容
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取笔记内容长度
	 * @return the contentLength
	 */
	public String getContentLength() {
		return contentLength;
	}
	/**
	 * @param contentLength the contentLength to set
	 */
	public void setContentLength(String contentLength) {
		this.contentLength = contentLength;
	}
	
}

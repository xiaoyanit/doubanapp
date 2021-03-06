/**
 * 
 */
package org.mcxiaoke.douban.api.model;

import java.util.Date;

import org.mcxiaoke.douban.api.parser.DoubanDateDeserializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author mcxiaoke
 * 
 */
public class DoubanComment extends AbstractModel {
	@JsonProperty("id")
	private long id;
	@JsonDeserialize(using = DoubanDateDeserializer.class)
	@JsonProperty("created")
	private Date createdAt;
	@JsonProperty("content")
	private String content;
	@JsonProperty("source")
	private String source;
	@JsonProperty("author")
	private DoubanUser author;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public DoubanUser getAuthor() {
		return author;
	}

	public void setAuthor(DoubanUser author) {
		this.author = author;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DoubanComment [id=");
		builder.append(id);
		builder.append(", createdAt=");
		builder.append(createdAt);
		builder.append(", content=");
		builder.append(content);
		builder.append(", source=");
		builder.append(source);
		builder.append(", author=");
		builder.append(author);
		builder.append("]");
		return builder.toString();
	}

}

/**
 * 
 */
package org.mcxiaoke.douban.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author mcxiaoke
 * 
 */
public class DoubanComments extends AbstractListModel {
	@JsonProperty("comments")
	private List<DoubanComment> comments;

	public List<DoubanComment> getComments() {
		return comments;
	}

	public void setComments(List<DoubanComment> comments) {
		this.comments = comments;
	}

}

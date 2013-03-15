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
public class DoubanBook extends AbstractModel {
	@JsonProperty("id")
	private long id;
	@JsonProperty("publisher")
	private String publisher;
	@JsonProperty("title")
	private String title;
	@JsonProperty("sub_title")
	private String subTitle;
	@JsonProperty("original_title")
	private String originalTitle;
	@JsonProperty("alt_title")
	private String altTitle;
	@JsonProperty("author_intro")
	private String authorIntro;
	@JsonProperty("pubdate")
	private String pubDate;
	@JsonProperty("isbn10")
	private String isbn10;
	@JsonProperty("isbn13")
	private String isbn13;
	@JsonProperty("binding")
	private String binding;
	@JsonProperty("url")
	private String url;
	@JsonProperty("image")
	private String image;
	@JsonProperty("price")
	private String price;
	@JsonProperty("pages")
	private int pages;
	@JsonProperty("author")
	private List<String> author;
	@JsonProperty("translator")
	private List<String> translator;
	@JsonProperty("tags")
	private List<DoubanTag> tags;
	@JsonProperty("rating")
	private DoubanRate rating;
	@JsonProperty("images")
	private DoubanImage images;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public String getAltTitle() {
		return altTitle;
	}

	public void setAltTitle(String altTitle) {
		this.altTitle = altTitle;
	}

	public String getAuthorIntro() {
		return authorIntro;
	}

	public void setAuthorIntro(String authorIntro) {
		this.authorIntro = authorIntro;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getIsbn10() {
		return isbn10;
	}

	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}

	public String getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public List<String> getAuthor() {
		return author;
	}

	public void setAuthor(List<String> author) {
		this.author = author;
	}

	public List<String> getTranslator() {
		return translator;
	}

	public void setTranslator(List<String> translator) {
		this.translator = translator;
	}

	public List<DoubanTag> getTags() {
		return tags;
	}

	public void setTags(List<DoubanTag> tags) {
		this.tags = tags;
	}

	public DoubanRate getRating() {
		return rating;
	}

	public void setRating(DoubanRate rating) {
		this.rating = rating;
	}

	public DoubanImage getImages() {
		return images;
	}

	public void setImages(DoubanImage images) {
		this.images = images;
	}

}

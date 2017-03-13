package org.wecancodeit.spring;

public class Review {
	long idForReview;
	String titleofReview;
	String imageUrlForReview;
	String reviewCategory;
	String contentattribute;

	public Review(long idForReview, String titleofReview, String imageUrlForReview, String reviewCategory,
			String contentattribute) {
		super();
		this.idForReview = idForReview;
		this.titleofReview = titleofReview;
		this.imageUrlForReview = imageUrlForReview;
		this.reviewCategory = reviewCategory;
		this.contentattribute = contentattribute;
	}

	/**
	 * @return the IdForReview
	 */
	public long getIdForReview() {
		return idForReview;
	}

	/**
	 * @return the titleofReview
	 */
	public String getTitleofReview() {
		return titleofReview;
	}

	/**
	 * @return the imageUrlForReview
	 */
	public String getImageUrlForReview() {
		return imageUrlForReview;
	}

	/**
	 * @return the reviewCategory
	 */
	public String getReviewCategory() {
		return reviewCategory;
	}

	/**
	 * @return the contentattribute
	 */
	public String getContentattribute() {
		return contentattribute;
	}

}
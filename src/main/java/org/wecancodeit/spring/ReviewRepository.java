package org.wecancodeit.spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	private Map<Long, Review> reviews = new HashMap<Long, Review>();

	public ReviewRepository() {
		long id = 1;

		Review review = new Review(1L, "Mini Cooper", "images/pic1.jpg", "Compact Sedans", "Transmission: Manual");

		reviews.put(id, review);

		id = 2;

		review = new Review(2L, "BMW X5", "images\\pic2.jpg", "Luxory SUV", "Transmission: Automatic");

		reviews.put(id, review);

		id = 3;

		review = new Review(3L, "Audi S4 Avant", "images\\pic3.jpg", "Mid-Sized Sudan", "Transmission: Manual");

		reviews.put(id, review);

	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(long id) {

		return reviews.get(id);
	}

}

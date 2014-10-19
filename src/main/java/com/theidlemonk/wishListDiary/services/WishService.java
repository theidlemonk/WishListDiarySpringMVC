package com.theidlemonk.wishListDiary.services;

import java.util.List;

import com.theidlemonk.wishListDiary.domain.Wish;

public interface WishService {
	List<Wish> getWishes();

	void addWish(Wish newWish);

	//void deleteWish(int Id);
}

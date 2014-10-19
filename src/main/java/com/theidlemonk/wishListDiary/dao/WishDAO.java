package com.theidlemonk.wishListDiary.dao;

import java.util.List;

import com.theidlemonk.wishListDiary.domain.Wish;

public interface WishDAO {

	public List<Wish> getAllWishes();

	public void addWish(Wish wish);

}

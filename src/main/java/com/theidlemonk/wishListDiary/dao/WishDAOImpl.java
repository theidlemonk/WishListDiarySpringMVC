package com.theidlemonk.wishListDiary.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.theidlemonk.wishListDiary.domain.Wish;

@Repository
public class WishDAOImpl implements WishDAO{

	private static List<Wish> myWishList = new ArrayList<>();

	public List<Wish> getAllWishes() {
		return myWishList;
	};

	public void addWish(Wish wish) {
		myWishList.add(wish);
	};

}
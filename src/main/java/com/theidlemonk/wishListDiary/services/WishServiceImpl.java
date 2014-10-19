package com.theidlemonk.wishListDiary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theidlemonk.wishListDiary.dao.WishDAO;
import com.theidlemonk.wishListDiary.domain.Wish;

@Service
public class WishServiceImpl implements WishService {

	@Autowired
	private WishDAO wishDAO;

	// public WishServiceImpl(WishDAO wishDao) {
	// wishDAO = wishDao;
	// }

	public List<Wish> getWishes() {
		return wishDAO.getAllWishes();
	}

	public void addWish(Wish newWish) {
		wishDAO.addWish(newWish);
	}

	// public void deleteWish(int Id) {
	//
	// }

}
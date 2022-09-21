package model.dao;

import java.util.ArrayList;

import model.vo.Coffee;

public interface CoffeeDaoInterface {

	public ArrayList<Coffee> openList();
	
	public void saveList(ArrayList<Coffee> list);
	
}
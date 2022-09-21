package controller;

import java.util.ArrayList;

import model.dao.CoffeeDao;
import model.exception.CoffeeException;
import model.vo.Coffee;

public class CoffeeManager {
	private Coffee[] orderArr;
	private ArrayList<Coffee> orderList;
	private CoffeeDao coDao;
	private int count;
	
	public CoffeeManager() {
		orderArr = new Coffee[10]; // 커피 주문을 10개 받는 객체배열
		coDao = new CoffeeDao(); // 주문 정보를 저장
		orderList = new ArrayList<Coffee>(); // 주문 리스트
		
	}
	
	public Coffee insertCoffee(Coffee coffee) {
		// 현재 주문된 커피의 주문 번호 등록
		//coffee.setOrderNo(count+1);
		//orderArr[count++] = coffee;
		
		coffee.setOrderNo(orderList.size()+1);
		orderList.add(coffee);
		
		return coffee;
	}
	
	public Coffee verifyCoffee(int orderNo) throws CoffeeException {
		/*
		if(orderNo > count) {
			throw new CoffeeException("잘못된 주문 정보입니다.");
		} else {
			return orderArr[orderNo-1];
		}
		*/
		if(orderNo > orderList.size()) {
			throw new CoffeeException("잘못된 주문 정보");
		}
		
		return orderList.get(orderNo-1);
	}
	
	public void updateCoffee(int orderNo, Coffee coffee) {
		// orderArr[orderNo-1]=coffee;
		coffee.setOrderNo(orderNo);
		orderList.set(orderNo-1, coffee);
		
	}
	
	public void deleteCoffee(int idx) {
		orderList.remove(idx);		
		//주문 번호 변경
		if(idx != orderList.size()) {
			for(int i=idx; i<orderList.size(); i++) {
				orderList.get(i).setOrderNo(i+1);
			}
		}
		
		/*
		orderArr[idx] = null;
		
		for(int i=idx; i<count; i++) {
			if(count <= orderArr.length && orderArr[i+1]!=null) {
				orderArr[i]=orderArr[i+1];
				orderArr[i].setOrderNo(i+1);
				orderArr[i+1]=null;
				
			}
		}
		count--;
		*/
	}
	/*
	public Coffee[] getOrderArr() {
		return orderArr;
	}
	
	public void setOrderArr(Coffee[] orderArr) {
		this.orderArr=orderArr;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count=count;
	}
	*/		
	public ArrayList<Coffee> getOrderList() {
		return orderList;
	}
	public void setOrderList(ArrayList<Coffee> orderList) {
		this.orderList=orderList;
	}
		
	public void close() {
		coDao.saveList(orderList);
	}
}
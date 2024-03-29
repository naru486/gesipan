package dao;

import java.util.List;

public interface CommonDAO {
	/*
	 * 추가 crate
	 * */
	public int insert(Object obj);
	/*
	 * 전체 요소의 갯수
	 * */
	public int count();
	/*
	 * ID 로 중복값 없이 추출
	 * */
	public Object getElementById(String id);
	/*
	 * Name으로 중복값 허용하며 추출
	 * */
	public List<Object> getElementsByName(String name);
	/*
	 * 전체 목록 추출
	 * */
	public List<Object> list();
	/*
	 * 수정
	 * */
	public int update(Object obj);
	/*
	 * 삭제
	 * */
	public int delete(String id);
}

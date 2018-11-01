package com.damienfremont.blog.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.damienfremont.blog.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

public class DatasRepository implements PagingAndSortingRepository<com.damienfremont.blog.model.Person, Serializable> {

	// MOCK
	static List<com.damienfremont.blog.model.Person> datas;
	static {
		datas = new ArrayList<Person>();
		for (int i = 0; i < 5000; i++) {
			datas.add(new Person(i + 1, "John", "Doe"));
			i++;
			datas.add(new Person(i + 1, "Mich", "Jogger"));
			i++;
			datas.add(new Person(i + 1, "Santa", "Close"));
		}
	}

	public Page<Person> findAll(Pageable arg0) {
		int pSize = arg0.getPageSize();
		int pNumb = arg0.getPageNumber();
		int pFirst = pNumb * pSize;
		int pLast = pFirst + pSize;
		int total = datas.size();
		List<Person> content = new ArrayList<Person>();
		for (int i = 0; i < total; i++) {
			if (i >= pFirst && i < pLast) {
				Person data = datas.get(i);
				content.add(data);
			}
		}
		return new PageImpl<Person>(content, arg0, total);
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Serializable arg0) {
		// TODO Auto-generated method stub

	}

	public void delete(Person arg0) {
		// TODO Auto-generated method stub

	}

	public void delete(Iterable<? extends Person> arg0) {
		// TODO Auto-generated method stub

	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	public boolean exists(Serializable arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Person> findAll(Iterable<Serializable> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Person findOne(Serializable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Person> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Person> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Person> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.example.demo;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service	
@Primary
public class PlaneServiceDB implements PlaneService{
	
	private PlaneRepo repo;

	public PlaneServiceDB(PlaneRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Plane makePlane(Plane plane) {
		return this.repo.save(plane);
	}

	@Override
	public List<Plane> getAllPlanes() {
		return null;
	}

	@Override
	public Plane getById(int id) {
		return null;
	}

	@Override
	public Plane updatePlane(int id, String name, Integer size, Double cost) {
		return null;
	}

	@Override
	public void delete(int id) {

	}
}

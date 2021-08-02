package com.example.SPRINGREST_2.services;

import java.util.List;

import com.example.SPRINGREST_2.zips.Zipsinfo;

public interface ZipService {
	public List<Zipsinfo> getZips();

	public Zipsinfo getZips(long x);

}

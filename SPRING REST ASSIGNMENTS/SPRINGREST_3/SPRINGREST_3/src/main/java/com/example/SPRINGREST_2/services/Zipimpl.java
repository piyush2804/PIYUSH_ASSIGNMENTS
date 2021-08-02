package com.example.SPRINGREST_2.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SPRINGREST_2.zips.Zipsinfo;

@Service
public class Zipimpl implements ZipService {
	List<Zipsinfo> list;

	public Zipimpl() {
		list = new ArrayList<>();
		list.add(new Zipsinfo(210, "Jaipur", "Rajasthan", "India"));
		list.add(new Zipsinfo(220, "Saharanpur", "Uttar Pradesh", "India"));
		list.add(new Zipsinfo(230, "Pune", "Maharashtra", "India"));
		list.add(new Zipsinfo(240, "Ranchi", "Jharkhand", "India"));
	}

	@Override
	public List<Zipsinfo> getZips() {

		return list;
	}

	@Override
	public Zipsinfo getZips(long zip) {

		Zipsinfo z = null;
		for (Zipsinfo zipsInfo : list) {
			if (zipsInfo.getZip() == zip) {
				z = zipsInfo;
				break;
			}
		}

		return z;
	}

}

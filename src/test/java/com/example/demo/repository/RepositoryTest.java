package com.example.demo.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Category;
import com.example.demo.entity.Location;
import com.example.demo.entity.PartyHouse;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RepositoryTest{

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private PartyHouseRepository partyHouseRepository;
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	private Location tsingyi = new Location("青衣", "Tsing Yi");
	private Location tsuenwan = new Location("荃灣", "Tsuen Wan");
	
	private Category simple = new Category("簡約","Simple");
	private Category cartoon = new Category("卡通","Cartoon");
	private Category singK = new Category("唱K","SingK");
	
	private PartyHouse partyHouse1 = new PartyHouse("派對屋1","PartyHouse1","長康","Cheung Hong","9:00~12:00",Arrays.asList(simple,cartoon,singK), tsingyi);
	private PartyHouse partyHouse2 = new PartyHouse("派對屋2","PartyHouse2","長康","Cheung Hong","9:00~12:00",Arrays.asList(simple),tsingyi);
	private PartyHouse partyHouse3 = new PartyHouse("派對屋3","PartyHouse3","綠楊","Green Yeung","9:00~12:00",Arrays.asList(simple,cartoon),tsuenwan);
	private PartyHouse partyHouse4 = new PartyHouse("派對屋4","PartyHouse4","綠楊","Green Yeung","9:00~12:00",Arrays.asList(simple,singK),tsuenwan);
	
	
	@Test
	public void testLocationRepository() throws Exception {				
		this.entityManager.persist(tsingyi);
		this.entityManager.persist(tsuenwan);

		List<Location> locationList;
		locationList = this.locationRepository.findByLocationChineseContaining("青衣");
		assertThat(locationList.contains(tsingyi));
		
		locationList = this.locationRepository.findByLocationEnglishContaining("Tsing Yi");
		assertThat(locationList.contains(tsingyi));
		
		locationList = this.locationRepository.findByLocationId(1L);
		assertThat(locationList.contains(tsingyi));
	}
	
	@Test
	public void testCategoryRepository() throws Exception{
		this.entityManager.persist(simple);
		this.entityManager.persist(cartoon);
		this.entityManager.persist(singK);
		
		List<Category> listCategory;
		listCategory = this.categoryRepository.findByCategoryChineseContaining("簡約");
		assertThat(listCategory.contains(simple));
		
		listCategory = this.categoryRepository.findByCategoryEnglishContaining("Simple");
		assertThat(listCategory.contains(simple));
		
		listCategory = this.categoryRepository.findByCategoryId(1L);
		assertThat(listCategory.contains(simple));
	}
	
	@Test
	public void testPartyHouseRepository() throws Exception{		
		this.entityManager.persist(simple);
		this.entityManager.persist(cartoon);
		this.entityManager.persist(singK);
		
		this.entityManager.persist(tsingyi);
		this.entityManager.persist(tsuenwan);
		
		this.entityManager.persist(partyHouse1);
		this.entityManager.persist(partyHouse2);
		this.entityManager.persist(partyHouse3);
		this.entityManager.persist(partyHouse4);
		
		List<PartyHouse> listPartyHouse;
		listPartyHouse = this.partyHouseRepository.findByPartyHouseNameEnglishContaining("PartyHouse1");
		assertThat(listPartyHouse.contains(partyHouse1));
		
		listPartyHouse = this.partyHouseRepository.findByPartyHouseNameChineseContaining("派對屋1");
		assertThat(listPartyHouse.contains(partyHouse1));
		
		listPartyHouse = this.partyHouseRepository.findByPartyHouseId(1L);
		assertThat(listPartyHouse.contains(partyHouse1));
	}
}

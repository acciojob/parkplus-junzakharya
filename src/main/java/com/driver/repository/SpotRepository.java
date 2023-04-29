package com.driver.repository;

import com.driver.model.ParkingLot;
import com.driver.model.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpotRepository extends JpaRepository<Spot, Integer>{

    @Query("select * from spot s where s.parking_lot =:parkingLot and s.spot_type =:spotType")
    List<Spot> findAvailableSpot(ParkingLot parkingLot, String spotType);
}

package com.reserve.landon.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.reserve.landon.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}
package com.example.bikeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface BikeRepository extends JpaRepository<Bike, Long>
{
}

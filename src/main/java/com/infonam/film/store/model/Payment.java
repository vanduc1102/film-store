package com.infonam.film.store.model;

import java.sql.Timestamp;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="payment", catalog="sakila")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="payment_id", unique=true,nullable=false)
	private int payment_id;
	private Customer customer;
	private Staff taff;
	private Rental rental;
	private float amount;
	private Date payment_date;
	private Timestamp last_update;
}

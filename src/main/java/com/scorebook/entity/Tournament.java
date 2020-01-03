package com.scorebook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Tournament {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String name;
		private String place;
		
		@ManyToOne
		@JoinColumn(name = "admin_id")
		private Admin admin;
}

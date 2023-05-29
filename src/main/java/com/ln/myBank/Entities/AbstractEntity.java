package com.ln.myBank.Entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public class AbstractEntity {
	@Id
	@GeneratedValue
	private long id;

	@CreatedDate
	@Column(name = "DateCreation", nullable = false, updatable = false)
	private LocalDateTime createdDate;

	@LastModifiedDate
	@Column(name = "DateModification")
	private LocalDateTime lastModifiedDate;

}

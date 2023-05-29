package com.ln.myBank.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ln.myBank.Entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	Client findByEmail(String email);

	Optional<Client> findById(Long id);

//	@Query(value="SELECT * FROM users", nativeQuery=true)
//	Page<UserEntity> findAllUsers(Pageable pageableRequest);

//	@Query("SELECT user FROM UserEntity user")
//	Page<UserEntity> findAllUsers(Pageable pageableRequest);

//	@Query(value="SELECT * FROM users u WHERE (u.first_name = ?1 OR u.last_name = ?1) AND u.email_verification_status = ?2", nativeQuery=true)
//	Page<UserEntity> findAllUserByCriteria(Pageable pageableRequest, String search, int status);

//	@Query(value="SELECT * FROM users u WHERE (u.first_name = :search OR u.last_name = :search) AND u.email_verification_status = :status", nativeQuery=true)
//	Page<UserEntity> findAllUserByCriteria(Pageable pageableRequest, @Param("search") String search, @Param("status") int status);

//	@Query(value="SELECT * FROM users u WHERE (u.first_name LIKE %:search% OR u.last_name LIKE %:search%) AND u.email_verification_status = :status", nativeQuery=true)
//	Page<UserEntity> findAllUserByCriteria(Pageable pageableRequest, @Param("search") String search, @Param("status") int status);

}

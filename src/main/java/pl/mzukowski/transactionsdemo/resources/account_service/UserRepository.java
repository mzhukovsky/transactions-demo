package pl.mzukowski.transactionsdemo.resources.account_service;

import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User, Long> {
}

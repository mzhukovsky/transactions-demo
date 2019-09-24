package pl.mzukowski.transactionsdemo.resources.account_service;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

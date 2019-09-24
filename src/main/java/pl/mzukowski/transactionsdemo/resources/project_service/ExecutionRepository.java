package pl.mzukowski.transactionsdemo.resources.project_service;

import org.springframework.data.jpa.repository.JpaRepository;

interface ExecutionRepository extends JpaRepository<Execution, Long> {
}

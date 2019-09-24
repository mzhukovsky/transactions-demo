package pl.mzukowski.transactionsdemo.resources.project_register;

import org.springframework.data.jpa.repository.JpaRepository;

interface ProjectRepository extends JpaRepository<Project, Long> {
}

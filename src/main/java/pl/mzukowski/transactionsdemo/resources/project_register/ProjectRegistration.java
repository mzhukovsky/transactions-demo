package pl.mzukowski.transactionsdemo.resources.project_register;

import org.springframework.stereotype.Service;

@Service
class ProjectRegistration {

    private final ProjectRepository projectRepository;

    public ProjectRegistration(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }
}

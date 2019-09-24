package pl.mzukowski.transactionsdemo.resources.project_service;

import org.springframework.stereotype.Service;

@Service
class ExecutionHandler {

    private final ExecutionRepository executionRepository;

    public ExecutionHandler(ExecutionRepository executionRepository) {
        this.executionRepository = executionRepository;
    }
}

package pl.mzukowski.transactionsdemo.resources.account_service;

import org.springframework.stereotype.Service;

@Service
class AccountRegistration {

    private final EmployeeRepository employeeRepository;
    private final UserRepository userRepository;

    public AccountRegistration(EmployeeRepository employeeRepository, UserRepository userRepository) {
        this.employeeRepository = employeeRepository;
        this.userRepository = userRepository;
    }
}

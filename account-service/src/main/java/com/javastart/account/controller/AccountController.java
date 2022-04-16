package com.javastart.account.controller;

import com.javastart.account.dto.AccountRequestDTO;
import com.javastart.account.dto.AccountResponseDTO;
import com.javastart.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

  private final AccountService accountService;

  @Autowired
  public AccountController(AccountService accountService) {
    this.accountService = accountService;
  }

  @GetMapping("/{accountId}")
  public AccountResponseDTO getAccount(@PathVariable Long accountId) {
    return new AccountResponseDTO(accountService.getAccountById(accountId));
  }

  @PostMapping
  public Long createAccount(@RequestBody AccountRequestDTO accountRequestDTO) {
    return accountService.createAccount(accountRequestDTO.getName(), accountRequestDTO.getEmail(),
        accountRequestDTO.getPhone(), accountRequestDTO.getBills());
  }

  @PutMapping("/{accountId}")
  public AccountResponseDTO updateAccount(@PathVariable Long accountId,
      @RequestBody AccountRequestDTO accountRequestDTO) {
    return new AccountResponseDTO(accountService.updateAccount(accountId,
        accountRequestDTO.getName(), accountRequestDTO.getEmail(), accountRequestDTO.getPhone(),
        accountRequestDTO.getBills()));
  }

  @DeleteMapping("/{accountId}")
  public AccountResponseDTO deleteAccount(@PathVariable Long accountId) {
    return new AccountResponseDTO(accountService.deleteAccount(accountId));
  }
}

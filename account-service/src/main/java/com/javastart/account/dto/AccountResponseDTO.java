package com.javastart.account.dto;

import com.javastart.account.entity.Account;
import java.time.OffsetDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AccountResponseDTO {
  private Long accountId;
  private String name;
  private String email;
  private String phone;
  private OffsetDateTime creationDate;
  private List<Long> bills;

  public AccountResponseDTO(Account account) {
    accountId = account.getAccountId();
    name = account.getName();
    email = account.getEmail();
    phone = account.getPhone();
    bills = account.getBills();
    creationDate = account.getCreationDate();
  }
}

